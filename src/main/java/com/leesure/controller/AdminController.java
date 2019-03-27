package com.leesure.controller;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.Order;
import com.leesure.remote.intl.AdminServiceApi;
import com.leesure.remote.intl.ShopServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on 2019/2/12.
 * 面向管理员的Controller
 * - 管理员权限使用的接口
 * @author yue
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ShopServiceApi shopServiceApi;

    @Autowired
    private AdminServiceApi adminServiceApi;


    @RequestMapping("/login")
    public PlainResult<Boolean> adminLogin(@RequestParam("name") String name,
                                           @RequestParam("password") String password){

        //todo adminLogin
        return null;
    }


    @RequestMapping("/register")
    public PlainResult<Boolean> adminRegister(Admin admin){

        //todo adminRegister
        return null;
    }

    @RequestMapping("/changeInfo")
    public PlainResult<Boolean> updateAdminInfo(Admin admin){

        //todo changeAdminInfo
        return null;
    }


    @RequestMapping("/releaseService")
    public PlainResult<Boolean> releaseService(){

        //todo 发布商店服务
        return null;
    }

    @RequestMapping("/offlineService")
    public PlainResult<Boolean> offlineService(){

        //todo offline service
        return null;
    }

    @RequestMapping("/getEvaluateList")
    public PageResult<Evaluate> getEvaluateList(){

        //todo 获取评价单 ** 管理员不可以编辑订单
        return null;
    }


    @RequestMapping("/removeEvaluate")
    public PlainResult<Boolean> removeEvaluate(@RequestParam("orderId") Long orderId){
        //todo 删除订单Id
        return null;
    }


    @RequestMapping("/getOrderList")
    public PageResult<Order> getOrderList(){
        //todo 获取商店全部清单
        return null;
    }


    @RequestMapping("/closeOrder")
    public PlainResult<Boolean> closeOrder(@RequestParam("orderId") Long orderId){


        return null;
    }

}

