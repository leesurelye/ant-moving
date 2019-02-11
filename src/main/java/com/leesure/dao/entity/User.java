package com.leesure.dao.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private String password;
    /**
     * primary key :phone
     */
    private String phone;



}
