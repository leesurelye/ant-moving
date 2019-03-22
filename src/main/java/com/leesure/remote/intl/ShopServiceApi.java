package com.leesure.remote.intl;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
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


    PageResult<ShopInfo> getShopInfoByCondition(String conditions);




}
