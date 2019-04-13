package com.leesure.controller;

import com.leesure.common.result.ListResult;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.*;
import com.leesure.remote.intl.ShopServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on 2019/3/15.
 * 面向商店服务的接口
 * @author yue
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopServiceApi shopServiceApi;


    @RequestMapping("/register")
    public PlainResult<Long> registerShop(ShopInfo shopInfo){
        PlainResult<Long> result = shopServiceApi.registerShopInfo(shopInfo);
        return result;
    }

    @RequestMapping("/active")
    public PlainResult<Boolean> activeShop(ShopInfo shopInfo){
        PlainResult<Boolean> result = shopServiceApi.activeShop(shopInfo);
        return result;
    }


    @RequestMapping("/queryByConditions")
    public ListResult<ShopInfo> queryByConditions(String address,
                                                  String name){
        return shopServiceApi.getShopInfoByCondition(address,name);
    }


    @RequestMapping("/getShopDetail")
    public PlainResult<ShopDetail> getShopDetail(@RequestParam("shopId") Long shopId){
        return shopServiceApi.getShopDetailById(shopId);
    }


    @RequestMapping("/getEvaluateList")
    public PageResult<Evaluate> getEvaluateList(@RequestParam("shopId") Long shopId,
                                                Integer page,Integer pageSize){
        return  shopServiceApi.getShopEvaluate(shopId,page,pageSize);

    }

    @RequestMapping("/getServiceList")
    public PageResult<ShopService> getServiceList(@RequestParam("shopId") Long shopId,
                                                  Integer page,Integer pageSize){

        return shopServiceApi.getShopService(shopId,page,pageSize);

    }


}
