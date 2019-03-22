package com.leesure.controller;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.entity.ShopService;
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


    @RequestMapping("/register")
    public PlainResult<Long> registerShop(ShopInfo shopInfo){


    }


    @RequestMapping("/getOrder")
    public PageResult<Order> getShopOrder(Long shopId){

        //todo 获取商店所属全部订单
        return null;
    }

    @RequestMapping("/changeOrderState")
    public PlainResult<Boolean> changeOrderState(@RequestParam("orderId") Long orderId,
                                                 @RequestParam("status")  String status){

        //todo 更新订单状态
        return null;
    }


    @RequestMapping("/getEvaluateList")
    public PageResult<Evaluate> getEvaluateList(){
        //todo 查询评价单列表
        return null;
    }

    @RequestMapping("/getServiceList")
    public PageResult<ShopService> getServiceList(@RequestParam("shopId") Long shopId){

        //todo 获取商店所属服务列表
        return null;

    }


}
