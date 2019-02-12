package com.leesure.service.intl;

import com.leesure.dao.entity.User;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public interface UserService {

     /**
      * 添加用户
      * @param user register user
      * @return isSuccess
      * @throws Exception exception
      */
     int addUser(User user) throws Exception;

     User queryUserByPhone(String phone);

     /**
      * user login inner  service
      * @return isSuccess
      * @throws Exception
      */
     User userLogin(String account,String password) throws Exception;
}
