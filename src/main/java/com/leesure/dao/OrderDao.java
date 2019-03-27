package com.leesure.dao;

import com.leesure.dao.entity.Order;
import com.leesure.dao.mybatis.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

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


    public List<Order> queryOrder(int begin,int pageSize,Map<String,Long> map){
        if (CollectionUtils.isEmpty(map)){
            //todo
            return null;
        }
        return mapper.selectOrder(begin,pageSize,map);
    }

    public int countOrderByConditions(Map<String,Long> map){
        if (CollectionUtils.isEmpty(map)){
            return 0;
        }
        return mapper.countByCondition(map);
    }

    public int updateOrder(Order order){
        return mapper.update(order);
    }
}
