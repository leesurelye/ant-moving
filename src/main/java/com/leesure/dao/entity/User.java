package com.leesure.dao.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Data
public class User {

    private Long id;

    private String name;

    private String password;

    private String phone;

    private String email;
    //是否为管理员
    private String isAdmin;
    //头像路径
    private String avatar;
}
