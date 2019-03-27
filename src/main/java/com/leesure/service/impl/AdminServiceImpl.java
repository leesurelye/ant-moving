package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.common.sysenum.OrderEnum;
import com.leesure.dao.AdminDao;
import com.leesure.dao.OrderDao;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.Order;
import com.leesure.service.intl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 *
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminDao adminDao;

    @Autowired
    private OrderDao orderDao;

    @Override
    public Admin login(String account,String password) throws Exception {
        Admin admin = adminDao.selectAdminByName(account);
        if (admin==null){
            throw new SystemException(SystemErrorCode.USER_NOT_EXISTS,account);
        }
        if (!password.equals(admin.getPassword())){
            throw new SystemException(SystemErrorCode.PASSWORD_ERROR,password);
        }

        return admin;
    }

    @Override
    public boolean addAdmin(Admin admin) {

        return false;
    }

    @Override
    public boolean closeOrder(Long orderId) {
        Order order= new Order();
        order.setId(orderId);
        order.setOrderState(OrderEnum.CLOSE.getStatus());
        return orderDao.updateOrder(order)>0;
    }
}
