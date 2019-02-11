package com.leesure.dao;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.leesure.dao.entity.User;
import com.leesure.dao.mybatis.UserMapper;

/**
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
}
