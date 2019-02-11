package com.leesure.service;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.service.intl.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public class UserServiceTest {

    @Autowired
    private UserServiceApi userServiceApi;

    @Autowired
    private UserService userService;

    @Test
    public void TestUserService(){


        System.out.println(userService==null);
        System.out.println(userServiceApi==null);

        User  user=new User();
        user.setName("lee");
        user.setPassword("123");
        user.setPhone("18236551812");
        userServiceApi.register(user);
    }
}
