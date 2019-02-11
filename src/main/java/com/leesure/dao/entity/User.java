package com.leesure.dao.entity;

import lombok.Data;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Data
public class User {

    private Long id;
    private String name;
    private String password;
    /**
     * primary key :phone
     */
    private String phone;



}
