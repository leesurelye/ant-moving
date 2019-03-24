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

    private String shopTitle;

    private String shopIntroduce;

    private int rate;

    private String shopAddress;

    private String phone;

    private String shopEmail;

}
