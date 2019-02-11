package com.leesure.remote.intl;

import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.User;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public interface UserServiceApi {

    /**
     * 注册用户
     * @param user user
     * @return isSuccess
     */
    PlainResult<Boolean> register(User user);

}
