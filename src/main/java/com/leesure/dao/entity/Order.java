package com.leesure.dao.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by yue on 2019/2/13.
 * 用户订单
 * @author yue
 */
@Data
public class Order {
    //订单id
    private Long id;
    //用户id
    private Long userId;
    //关联的商店serviceId
    private String serviceId;

    //用户地址
    private String address;
    //用户新地址
    private String destination;
    //创建时间
    private Date createTime;
    //总付款
    private Integer totalPay;
    //是否删除
    private Boolean isDeleted;
}
