package com.leesure.remote.intl;

import com.leesure.common.result.ListResult;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;

import java.util.List;

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
     * 条件查询商店信息
     * @param conditions 条件
     * @return  查询结果
     */
    ListResult<ShopInfo> getShopInfoByCondition(List<String> conditions);


    /**
     * 通过商店Id获取商店详细信息
     * @param shopId shopId
     * @return 商店详细信息
     */
    PlainResult<ShopDetail> getShopDetailById(Long shopId);


}
