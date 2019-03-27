package com.leesure.service.intl;

import com.leesure.common.exception.SystemException;
import com.leesure.common.sysenum.OrderEnum;
import com.leesure.dao.entity.Order;

import java.util.List;

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

    /**
     * 分页查询订单
     * @param page 当前页面 ，默认为1
     * @param pageSize 当前页面大小，默认为10
     * @return 查询列表
     */
    List<Order> queryOrderPagination(int page ,int pageSize,Long userId)
            throws SystemException;

    /**
     * 获取用户订单总数量
     * @param id id
     * @return 订单总数量
     */
    int countOrder(Long id);


    /**
     * 更新订单状态
     * @param orderState 订单状态枚举类
     * @param orderId  订单id
     * @return  是否修改成功
     */
    boolean updateOrderState(Long orderId , OrderEnum orderState)
            throws SystemException;

}
