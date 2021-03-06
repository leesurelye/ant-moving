package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.leesure.dao.entity.ShopService;

import java.util.List;

@Mapper
public interface ShopServiceMapper {
    int insert(@Param("pojo") ShopService pojo);

    int insertSelective(@Param("pojo") ShopService pojo);

    int insertList(@Param("pojos") List<ShopService> pojo);

    int update(@Param("pojo") ShopService pojo);

    List<ShopService> selectShopServiceByShopId(@Param("shopId") Long shopId,
                                                @Param("pageBegin") Integer begin,
                                                @Param("size") Integer pageSize);

    int countService(@Param("shopId") Long shopId);

    long getShopId(@Param("adminId") Long adminId);
}
