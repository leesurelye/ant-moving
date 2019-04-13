package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.leesure.dao.entity.User;

@Mapper
public interface UserMapper {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    List<User> selectUserByConditions(@Param("value") String value);

    User selectUserById(@Param("id")Long id);
}
