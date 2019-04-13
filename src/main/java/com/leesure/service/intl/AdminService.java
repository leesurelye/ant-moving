package com.leesure.service.intl;

import com.leesure.common.exception.SystemException;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.Order;

import java.util.List;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
public interface AdminService {

    /**
     * 通过账户名称获得账户信息
     * @param account 账户名称
     * @return admin
     */
    Admin login(String account,String password) throws Exception;


    /**
     * 添加管理员
     * @param admin admin
     * @return 是否添加成功
     */
    boolean addAdmin(Admin admin);


    /**
     * 关闭订单
     * @param orderId  订单号
     * @return
     */
    boolean closeOrder(Long orderId)
            throws SystemException;


    /**
     * 获取商店订单
     * @param shopId
     * @param page
     * @param pageSize
     * @return
     */
    List<Order> queryOrderList(Long shopId,Integer page,Integer pageSize);

    int countOrderList(Long shopId);
}
