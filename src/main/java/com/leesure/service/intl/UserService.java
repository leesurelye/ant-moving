package com.leesure.service.intl;

import com.leesure.dao.entity.User;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public interface UserService {

     /**
      * 添加用户
      * @param user
      * @return
      * @throws Exception
      */
     int addUser(User user) throws Exception;

     User queryUserByPhone(String phone);


}
