package com.leesure.controller;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.utils.CreateValidateCode;
import com.leesure.utils.MessageSendUtils;
import com.leesure.utils.ValidateCodeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by yue on 2019/2/11.
 *
 * @author yue
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceApi userServiceApi;

    @Autowired
    private MessageSendUtils messageSendUtils;


    @RequestMapping("/login")
    public PlainResult<User> login(@RequestParam("name") String name,
                                   @RequestParam("password") String password) {
        PlainResult<User> result = userServiceApi.login(name, password);
        if (result.getSuccess()) {
            //todo 在cookie 中设置用户信息
        }
        return result;
    }

    @RequestMapping("/register")
    public PlainResult<Boolean> register(@RequestParam("name") String name,
                                         @RequestParam("password") String password,
                                         @RequestParam("phone") String phone,
                                         HttpSession session) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        user.setName(name);
        PlainResult<Boolean> result = userServiceApi.register(user);
        if (result.getSuccess()) {
            session.setAttribute("user", user);
        }
        return result;
    }


    @RequestMapping("/getUserInfo")
    public PlainResult<User> getUserInfo(@RequestParam("userId") Long userID){
        return userServiceApi.getUserInfo(userID);
    }

    @RequestMapping("/updateUserInfo")
    public PlainResult<Boolean> updateUseInfo(User user) {
        return  userServiceApi.updateUserInfo(user);
    }





    @RequestMapping("/changePassword")
    public PlainResult<Boolean> changePassword(@RequestParam("userId") Long userId,
                                               String email,
                                               @RequestParam("newPwd") String newPwd) {
        String validateCode = ValidateCodeFactory.getEmailValidateCode();
        PlainResult<Boolean> result = userServiceApi.changePassword(userId, newPwd);
        result.setData(messageSendUtils == null);
        SimpleMailMessage message = messageSendUtils.sendValidateCode(email, validateCode);


        //result.setData(messageSendUtils==null);
        return result;
    }

    @RequestMapping("/createOrder")
    public PlainResult<Order> submitOrder(Order order) {
        return userServiceApi.createOrder(order);
    }


    @RequestMapping("/submitOrder")
    public PlainResult<Boolean> submitOrder(@RequestParam("orderId") Long orderId) {
        return  userServiceApi.submitOrder(orderId);
    }

    @RequestMapping("/queryOrder")
    public PageResult<Order> queryOrder(@RequestParam("userId") Long userId,
                                        Integer page, Integer pageSize) {

        return userServiceApi.getOrderList(userId, page, pageSize);
    }


    @RequestMapping("/deleteOrder")
    public PlainResult<Boolean> deleteOrder(@RequestParam("orderId") Long orderId) {
        return userServiceApi.removeOrder(orderId);
    }

    @RequestMapping("/removeEvaluate")
    public PlainResult<Boolean> removeEvaluate(@RequestParam("orderId") Long orderId){
        //todo 删除订单Id
        return null;
    }


    @RequestMapping("/getValidateCode")
    public void getValidateCode(HttpServletResponse response,
                                HttpSession session) {

        try {
            CreateValidateCode vsCode = new CreateValidateCode(100, 30, 5, 10);
            session.setAttribute("vsCode", vsCode.getCode());
            log.info("vsCode={}", vsCode.getCode());
            vsCode.write(response.getOutputStream());
        } catch (Exception e) {
            log.error("getValidateCode Exception :{}", e.getMessage());
        }
    }
}
