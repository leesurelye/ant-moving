package com.leesure.service.intl;

import com.leesure.common.exception.SystemException;
import com.leesure.dao.entity.Order;

/**
 * Created by yue on 2019/3/27.
 * 订单服务
 * @author yue
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order 订单信息
     * @return 如果创建成功，则直接返回创建成功的订单信息，
     *          如果没有创建成功，则返回为空
     */
    Order  addOrder(Order order) throws SystemException;


    /**
     * 根据订单号查询订单信息
     * @param orderId 订单号
     * @return 返回订单信息
     */
    Order getOrderById(Long orderId);


    /**
     * 通过订单号删除订单 - 逻辑删除
     * @param id 订单号
     * @return 是否产出成功
     */
    boolean deleteOrderById(Long id);
}
