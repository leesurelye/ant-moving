package com.leesure.dao.entity;

import lombok.Data;

/**
 * Created by yue on 2019/3/14.
 * 商店的简略信息
 * @author yue
 */
@Data
public class ShopInfo {
    private Long shopId;
    private String shopName;
    private String shopIntroduce;
    //商店评级
    private int rate;
}
