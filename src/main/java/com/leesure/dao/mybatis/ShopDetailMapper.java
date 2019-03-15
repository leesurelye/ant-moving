package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.leesure.dao.entity.ShopDetail;

@Mapper
public interface ShopDetailMapper {
    int insert(@Param("pojo") ShopDetail pojo);

    int insertSelective(@Param("pojo") ShopDetail pojo);

    int insertList(@Param("pojos") List<ShopDetail> pojo);

    int update(@Param("pojo") ShopDetail pojo);
}
