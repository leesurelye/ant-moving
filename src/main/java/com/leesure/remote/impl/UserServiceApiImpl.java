package com.leesure.remote.impl;

import com.leesure.common.exception.SystemException;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.service.intl.UserService;
import com.leesure.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
@Service
@Slf4j
public class UserServiceApiImpl implements UserServiceApi {

    @Autowired
    private UserService userService;

    @Override
    public PlainResult<Boolean> register(User user) {
        PlainResult<Boolean> result  = new PlainResult<>();
        try{
            //todo 验证码的处理
            String encrypt = MD5Utils.getMD5(user.getPassword());
            user.setPassword(encrypt);
            int data = userService.addUser(user);
            result.setData(data>0);
        } catch (Exception e){
            result.setData(false);
            result.setMsg(e.getMessage());
            log.error("register User is Exception:{}",e.getMessage());
        }
        return result;
    }
}
