package com.leesure.dao.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by yue on 2019/2/26.
 * @author yue
 * 店家详细信息
 */
@Data
public class ShopDetail {

    private Integer id;
    //商店名称
    private String title;
    //店家描述
    private String desc;
    //店家评级
    private Integer rate;
    //是否为推荐店家
    private Boolean isExcellent;
    //商店服务列表
    private List<ShopService> serviceList;
    //商店联系电话
    private String phone;
    //店家详情页图片 - 路径
    private List<String> imageUrls;
    //商家地址
    private String address;

}
