package com.leesure.controller;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import javafx.scene.paint.PhongMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/login")
    public  int  login(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       String code){

        User user = new User();
        user.setName(username);
        user.setPassword(password);
        userServiceApi.register(user);
        return 0;
    }

    @RequestMapping("/register")
    public int register(@RequestParam("name") String name,
                        @RequestParam("password") String password,
                        @RequestParam("phone") String phone){
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        user.setName(name);
        userServiceApi.register(user);
        return 0;
    }


}
