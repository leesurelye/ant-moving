package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.leesure.dao.entity.Evaluate;

@Mapper
public interface EvaluateMapper {
    int insert(@Param("pojo") Evaluate pojo);

    int insertSelective(@Param("pojo") Evaluate pojo);

    int insertList(@Param("pojos") List<Evaluate> pojo);

    int update(@Param("pojo") Evaluate pojo);

    List<Evaluate> selectByIdMap(@Param("map")Map<String,Long> map,
                                 @Param("begin") int begin,
                                 @Param("pageSize") int pageSize);

    int countEvaluate(@Param("map") Map<String,Long> map);
}
