package com.leesure.dao.entity;

import lombok.Data;

import java.util.Date;

/**
 * 评价单
 * Created by yue on 2019/3/14.
 * @author yue
 */
@Data
public class Evaluate {

    private Long id;
    //关联的订单id
    private Long orderId;
    //评价内容
    private String info;
    //评价创建时间
    private Date createTime;
    //评价级别
    private Integer rate;

    private Boolean isDelete;

    private String userName;

}

