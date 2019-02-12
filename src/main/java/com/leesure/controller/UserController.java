package com.leesure.controller;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.utils.CreateValidateCode;
import com.leesure.utils.MD5Utils;
import javafx.scene.paint.PhongMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/login")
    public  PlainResult<User>  login(@RequestParam("account") String account,
                       @RequestParam("password") String password,
                       String code, HttpSession session){
        PlainResult<User> result = userServiceApi.login(account, password);
        if (result.getSuccess()){
            session.setAttribute("user",result.getData());
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


}
