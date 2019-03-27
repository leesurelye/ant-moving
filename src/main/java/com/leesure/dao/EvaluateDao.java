package com.leesure.dao;

import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.mybatis.EvaluateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
@Service
public class EvaluateDao {

    @Resource
    private EvaluateMapper mapper;


    public int addEvaluate(Evaluate evaluate){
        return mapper.insert(evaluate);
    }

}
