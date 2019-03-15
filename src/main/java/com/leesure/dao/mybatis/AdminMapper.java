package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.leesure.dao.entity.Admin;

@Mapper
public interface AdminMapper {
    int insert(@Param("pojo") Admin pojo);

    int insertSelective(@Param("pojo") Admin pojo);

    int insertList(@Param("pojos") List<Admin> pojo);

    int update(@Param("pojo") Admin pojo);

    Admin selectAdminByName(@Param("account") String account);
}
