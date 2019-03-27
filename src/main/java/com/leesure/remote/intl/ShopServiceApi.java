package com.leesure.remote.intl;

import com.leesure.common.result.ListResult;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
public interface ShopServiceApi {

    /**
     * 注册商店基本信息
     * @param shopInfo shopInfo
     * @return 注册商店的id
     */
    PlainResult<Long> registerShopInfo(ShopInfo shopInfo);


    /**
     * 激活商店 并完善商店信息
     * - 通过手机邮箱激活 shopEmail
     * @param shopInfo shopId
     * @return 是否激活成功
     */
    PlainResult<Boolean> activeShop(ShopInfo shopInfo);

    /**
     * 条件查询商店信息
     * @param address 地址
     * @param value 店家名称
     * @return  查询结果
     */
    ListResult<ShopInfo> getShopInfoByCondition(String address,String value);


    /**
     * 通过商店Id获取商店详细信息,包括商店没有删除的服务列表
     * @param shopId shopId
     * @return 商店详细信息
     */
    PlainResult<ShopDetail> getShopDetailById(Long shopId);


    /**
     * 获取商店评价列表
     * @param shopId 商店id
     * @return 评价列表
     */
    PageResult<Evaluate> getShopEvaluate(Long shopId,Integer page,Integer pageSize);
}
