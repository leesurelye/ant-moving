package com.leesure.remote.intl;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.ShopDetail;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
public interface AdminServiceApi {

    PlainResult<Boolean> login(String name,String password);

    /**
     * 注册管理员
     * @param admin
     * @return
     */
    PlainResult<Boolean> register(Admin admin);

    /**
     * 管理员注册商店
     * @param accountId 管理员Id
     * @param shopDetail 商店详细信息
     * @return 注册成功后的商店id
     */
    PlainResult<Long> registerShop(Long accountId, ShopDetail shopDetail);


    /**
     * 管理员更新商店基本信息
     * @param shopDetail
     * @return
     */
    PlainResult<Boolean> updateShopInfo(ShopDetail shopDetail);



}
