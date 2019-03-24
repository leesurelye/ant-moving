package com.leesure.dao.mybatis;

import com.leesure.dao.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.leesure.dao.entity.ShopDetail;

@Mapper
public interface ShopDetailMapper {

    ShopDetail selectOne(@Param("shopId") Long shopId);

    int insert(@Param("pojo") ShopDetail pojo);

    int insertShopInfo(@Param("shopInfo") ShopInfo shopInfo);

    int insertSelective(@Param("pojo") ShopDetail pojo);

    int insertList(@Param("pojos") List<ShopDetail> pojo);

    int update(@Param("pojo") ShopDetail pojo);

    int updateShopInfo(@Param("shopInfo") ShopInfo shopInfo);

    /**
     * 查询所有商店基本信息
     * @return
     */
    List<ShopInfo> selectAllShopInfo();


    List<ShopInfo> selectShopInfoByConditions(@Param("map")Map<String,String> map);


    List<ShopInfo> selectShopInfoByAddress(@Param("address") String address,
                                           @Param("name") String name);
}
