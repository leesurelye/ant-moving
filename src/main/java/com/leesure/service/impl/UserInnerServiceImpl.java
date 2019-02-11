package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.entity.User;
import com.leesure.service.intl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Service
@Slf4j
public class UserInnerServiceImpl implements UserService {

    @Override
    public int addUser(User user) throws SystemException {
        if (user==null){
            throw new SystemException(SystemErrorCode.SYSTEM_UNKNOWN_ERROR);
        }
        return 0;
    }

    @Override
    public User queryUserByPhone(String phone) {
        return null;
    }
}
