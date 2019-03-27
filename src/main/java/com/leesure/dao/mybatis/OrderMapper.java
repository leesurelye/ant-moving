package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.leesure.dao.entity.Order;

@Mapper
public interface OrderMapper {
    int insert(@Param("pojo") Order pojo);

    int insertSelective(@Param("pojo") Order pojo);

    int insertList(@Param("pojos") List<Order> pojo);

    int update(@Param("pojo") Order pojo);

    Order selectOrderById(@Param("id") Long id);

    List<Order> selectOrder(@Param("begin") int begin,
                            @Param("pageSize") int pageSize,
                            @Param("map") Map<String,Long> map);


    int countByCondition(@Param("map")Map<String,Long> map);
}
