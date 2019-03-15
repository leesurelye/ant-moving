package com.leesure.dao.entity;

import lombok.Data;

/**
 * Created by yue on 2019/2/26.
 * 管理员
 * @author yue
 */
@Data
public class Admin {

    private Long id;
    //管理的商店Id
    private Long shopId;

    private String account;
    private String password;
    //管理员级别
    private String level;
    private String email;
    private String phone;
}
