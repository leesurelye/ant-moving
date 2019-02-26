package com.leesure.controller;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.utils.CreateValidateCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/login")
    public  PlainResult<User>  login(@RequestParam("account") String account,
                                     @RequestParam("password") String password){
        PlainResult<User> result = userServiceApi.login(account, password);
        if (result.getSuccess()){
             //todo 在cookie 中设置用户信息
        }
        return result;
    }

    @RequestMapping("/register")
    public PlainResult<Boolean> register(@RequestParam("name") String name,
                        @RequestParam("password") String password,
                        @RequestParam("phone") String phone,
                        HttpSession session){
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        user.setName(name);
        PlainResult<Boolean> result = userServiceApi.register(user);
        if (result.getSuccess()){
            session.setAttribute("user",user);
        }
        return result;
    }

    @RequestMapping("/updateUserInfo")
    public PlainResult<Boolean> updateUseInfo(){
        PlainResult<Boolean> result = new PlainResult<>();
        //todo 修改个人信息
        return result;
    }


    @RequestMapping("/changePassword")
    public PlainResult<Boolean> changePassword(){
        PlainResult<Boolean> result = new PlainResult<>();
        //todo 修改密码请求
        return result;
    }




    @RequestMapping("/queryOrder")
    public PageResult<Order> queryOrder(){
        PageResult<Order> result = new PageResult<>();
        //todo 查询个人订单[ 包含历史纪录 未完成订单 ]
        return result;
    }


    @RequestMapping("/submitOrder")
    public PlainResult<Boolean> submitOrder(){
        PlainResult<Boolean> result = new PlainResult<>();
        //todo 提交订单
        return result;
    }


    @RequestMapping("/deleteOrder")
    public PlainResult<Boolean> deleteOrder(){
        PlainResult<Boolean> result = new PlainResult<>();
        //todo 删除订单
        return result;
    }

    @RequestMapping("/getValidateCode")
    public void getValidateCode(HttpServletResponse response,
                                HttpSession session){

        try{
            CreateValidateCode vsCode=new CreateValidateCode(100, 30, 5, 10);
            session.setAttribute("vsCode",vsCode.getCode());
            log.info("vsCode={}",vsCode.getCode());
            vsCode.write(response.getOutputStream());
        }catch (Exception e){
            log.error("getValidateCode Exception :{}",e.getMessage());
        }
    }
}
