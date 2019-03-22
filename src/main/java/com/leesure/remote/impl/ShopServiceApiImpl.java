package com.leesure.remote.impl;

import com.leesure.common.exception.SystemException;
import com.leesure.common.result.ListResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.entity.ShopService;
import com.leesure.remote.intl.ShopServiceApi;
import com.leesure.service.intl.ShopDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
@Service("ShopServiceApi")
@Slf4j
public class ShopServiceApiImpl implements ShopServiceApi {


    @Autowired
    private ShopDetailService detailService;


    @Override
    public PlainResult<Long> registerShopInfo(ShopInfo shopInfo) {
        PlainResult<Long> result = new PlainResult<>();
        //check param
        try{
            detailService.addShopInfo(shopInfo);
        }catch (SystemException exception){
            result.setMsg(exception.getMessage());
            result.setCode(exception.getCode());
            result.setSuccess(false);
            return result;
        }catch (Exception e){
            result.setMsg(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public ListResult<ShopInfo> getShopInfoByCondition(List<String> conditions) {
        return null;
    }

    @Override
    public PlainResult<ShopDetail> getShopDetailById(Long shopId) {
        return null;
    }
}
