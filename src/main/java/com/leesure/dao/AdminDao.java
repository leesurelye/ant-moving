package com.leesure.dao;

import com.leesure.dao.entity.Admin;
import com.leesure.dao.mybatis.AdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yue on 2019/3/14.
 * @author yue
 */
@Service
public class AdminDao {

    @Resource
    private AdminMapper mapper;

    public Admin selectAdminByName(String name){
        return mapper.selectAdminByName(name);
    }
}
