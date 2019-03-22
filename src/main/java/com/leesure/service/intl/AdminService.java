package com.leesure.service.intl;

import com.leesure.dao.entity.Admin;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
public interface AdminService {

    /**
     * 通过账户名称获得账户信息
     * @param account 账户名称
     * @return admin
     */
    Admin login(String account,String password) throws Exception;


    /**
     * 添加管理员
     * @param admin admin
     * @return 是否添加成功
     */
    boolean addAdmin(Admin admin);



}
