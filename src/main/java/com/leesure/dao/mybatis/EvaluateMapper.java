package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.leesure.dao.entity.Evaluate;

@Mapper
public interface EvaluateMapper {
    int insert(@Param("pojo") Evaluate pojo);

    int insertSelective(@Param("pojo") Evaluate pojo);

    int insertList(@Param("pojos") List<Evaluate> pojo);

    int update(@Param("pojo") Evaluate pojo);
}
