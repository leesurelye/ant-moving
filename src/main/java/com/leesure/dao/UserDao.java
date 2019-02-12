package com.leesure.dao;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.leesure.dao.entity.User;
import com.leesure.dao.mybatis.UserMapper;
import org.springframework.util.CollectionUtils;

/**
 * @since 2019/02/11
 * @author yue
 */
@Service
public class UserDao{

    @Resource
    private UserMapper userMapper;

    public int insert(User pojo){
        return userMapper.insert(pojo);
    }

    public int insertSelective(User pojo){
        return userMapper.insertSelective(pojo);
    }

    public int insertList(List<User> pojos){
        return userMapper.insertList(pojos);
    }

    public int update(User pojo){
        return userMapper.update(pojo);
    }


    public User queryUserByConditions(String condition){
        List<User> userList = userMapper.selectUserByConditions(condition);
        if (CollectionUtils.isEmpty(userList)){
            return null;
        }
        return  userList.get(0);
    }
}
