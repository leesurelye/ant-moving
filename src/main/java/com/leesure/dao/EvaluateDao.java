package com.leesure.dao;

import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.mybatis.EvaluateMapper;
import com.leesure.dao.mybatis.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/15.
 *
 * @author yue
 */
@Service
public class EvaluateDao {

    @Resource
    private EvaluateMapper mapper;

    @Resource
    private UserMapper userMapper;


    public int addEvaluate(Evaluate evaluate) {
        return mapper.insert(evaluate);
    }


    public List<Evaluate> queryEvaluatePagination(Map<String, Long> idMap,
                                                  int page, int pageSize) {
        if (CollectionUtils.isEmpty(idMap)) {
            return null;
        }
        return mapper.selectByIdMap(idMap, (page - 1) * pageSize, pageSize);
    }


    public int countEvaluateByID(Map<String, Long> map) {
        if (CollectionUtils.isEmpty(map)) {
            return 0;
        }
        return mapper.countEvaluate(map);
    }

}
