package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.UserDao;
import com.leesure.dao.entity.User;
import com.leesure.service.intl.UserService;
import com.leesure.utils.PrimaryKeyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Service
@Slf4j
public class UserInnerServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public int  addUser(User user) throws SystemException {

        user.setId(PrimaryKeyUtils.createUserPrimaryId());
        return userDao.insert(user);
    }

    @Override
    public boolean changePassword(Long userId, String newPwd) {
        User user = new User();
        user.setId(userId);
        user.setPassword(newPwd);

//        return userDao.update(user)==1;
        return true;
    }

    @Override
    public User queryUserByPhone(String phone) {
        return null;
    }

    @Override
    public boolean updateUserBasicInfo(User user)
            throws SystemException{
        if (user.getId()==null){
            throw new SystemException(SystemErrorCode.MISS_PARAM,"userId");
        }
        return userDao.update(user)>0;
    }

    @Override
    public User userLogin(String account,String password) throws Exception {
        User user = userDao.queryUserByConditions(account);
        if (user==null){
            throw new SystemException(SystemErrorCode.USER_NOT_EXISTS,account);
        }
        if (!password.equals(user.getPassword())){
            throw  new SystemException(SystemErrorCode.PASSWORD_ERROR);
        }
        return user;
    }
}
