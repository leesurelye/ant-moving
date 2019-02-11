package com.leesure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@RestController
public class UserController {

    @RequestMapping("/")
    public String getData(){
        return "hello word";
    }
}
