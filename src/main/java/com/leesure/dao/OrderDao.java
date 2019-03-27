package com.leesure.dao;

import com.leesure.dao.entity.Order;
import com.leesure.dao.mybatis.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yue on 2019/3/27.
 * @author yue
 */
@Service
public class OrderDao {

    @Resource
    private OrderMapper mapper;


    public Order createOrder(Order order){
        order.setCreateTime(new Date());
        int result = mapper.insertSelective(order);
        if (result>0){
            return order;
        }
        return null;
    }


    public Order selectOrderById(Long id){
        return  mapper.selectOrderById(id);
    }

    public int deleteOrderById(Long id){
        Order order = new Order();
        order.setId(id);
        order.setIsDeleted(true);
        return mapper.update(order);
    }
}
