package com.leesure.controller;

import com.leesure.common.result.PlainResult;
import com.leesure.remote.intl.UserServiceApi;
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
                       @RequestParam("password") String password){


        return 0;
    }
}
