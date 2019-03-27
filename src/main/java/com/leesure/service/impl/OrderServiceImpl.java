package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.OrderDao;
import com.leesure.dao.entity.Order;
import com.leesure.service.intl.OrderService;
import com.leesure.utils.PrimaryKeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/3/27.
 * @author yue
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService  {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order addOrder(Order order) throws SystemException{
        if (order.getUserId()==null || order.getServiceId()==null){
            throw new SystemException(SystemErrorCode.MISS_PARAM,"userId,serviceId");
        }
        order.setId(PrimaryKeyUtils.createOrderId(order.getUserId(),
                order.getServiceId()));
        return  orderDao.createOrder(order);
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderDao.selectOrderById(orderId);
    }

    @Override
    public boolean deleteOrderById(Long id) {
        int i = orderDao.deleteOrderById(id);
        return i>0;
    }
}
