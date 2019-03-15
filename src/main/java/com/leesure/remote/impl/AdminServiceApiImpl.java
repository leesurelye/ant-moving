package com.leesure.remote.impl;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.remote.intl.AdminServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
@Service("AdminServiceApi")
@Slf4j
public class AdminServiceApiImpl implements AdminServiceApi {


    @Override
    public PlainResult<Boolean> login(String name, String password) {
        return null;
    }

    @Override
    public PlainResult<Boolean> register(Admin admin) {
        return null;
    }

    @Override
    public PlainResult<Long> registerShop(Long accountId, ShopDetail shopDetail) {
        return null;
    }

    @Override
    public PlainResult<Boolean> updateShopInfo(ShopDetail shopDetail) {
        return null;
    }
}
