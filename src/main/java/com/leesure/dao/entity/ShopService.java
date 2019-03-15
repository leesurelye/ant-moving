package com.leesure.dao.entity;

import lombok.Data;

/**
 * Created by yue on 2019/2/26.
 * 商店对应的服务列表信息
 * @author yue
 * 店家基本信息
 */
@Data
public class ShopService {

    //服务id
    private Long     id;
    //商店id
    private Integer     shopId;
    //服务标题
    private String      title;
    //描述
    private String      desc;

    //服务评价
    private Integer    rate;
    //服务价格
    private String      price;

    //服务是否下线
    private Boolean isDelete;


}
