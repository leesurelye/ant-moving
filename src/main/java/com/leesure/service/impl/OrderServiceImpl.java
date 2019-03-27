package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.common.sysenum.OrderEnum;
import com.leesure.dao.OrderDao;
import com.leesure.dao.entity.Order;
import com.leesure.service.intl.OrderService;
import com.leesure.utils.PrimaryKeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/27.
 *
 * @author yue
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order addOrder(Order order) throws SystemException {
        if (order.getUserId() == null || order.getServiceId() == null) {
            throw new SystemException(SystemErrorCode.MISS_PARAM, "userId,serviceId");
        }
        order.setId(PrimaryKeyUtils.createOrderId(order.getUserId(),
                order.getServiceId()));
        return orderDao.createOrder(order);
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderDao.selectOrderById(orderId);
    }

    @Override
    public boolean deleteOrderById(Long id) {
        int i = orderDao.deleteOrderById(id);
        return i > 0;
    }

    @Override
    public List<Order> queryOrderPagination(int page, int pageSize,
                                            Long userId) {
        Map<String, Long> map = new HashMap<>();
        map.put("user_id", userId);
        return orderDao.queryOrder(pageSize * (page - 1), pageSize, map);
    }

    @Override
    public int countOrder(Long userId) {
        Map<String, Long> map = new HashMap<>();
        map.put("user_id", userId);
        return orderDao.countOrderByConditions(map);
    }

    @Override
    public boolean updateOrderState(Long orderId, OrderEnum orderState) {
        Order order = new Order();
        order.setId(orderId);
        order.setOrderState(orderState.getStatus());
        return orderDao.updateOrder(order) > 0;
    }
}
