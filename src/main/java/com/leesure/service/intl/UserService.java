package com.leesure.service.intl;

import com.leesure.common.exception.SystemException;
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


     /**
      * 修改账户密码
      * @param userId 账户id
      * @param newPwd 新密码
      * @return 修改的行数
      */
     boolean changePassword(Long userId, String newPwd);

     /**
      * 根据用户电话查询用户信息
      * @param phone telephone
      * @return isSuccess
      */
     User queryUserByPhone(String phone);


     /**
      * 更具用户的ID查找用户信息
      * @param userID userID
      * @return user object
      */
     User queryUserById(Long userID);
     /**
      * 更新用户基本信息 -不包含个人密码
      * @param user
      * @return
      */
     boolean updateUserBasicInfo(User user) throws SystemException;

     /**
      * user login inner  service
      * @return isSuccess
      * @throws Exception
      */
     User userLogin(String account,String password) throws Exception;
}
