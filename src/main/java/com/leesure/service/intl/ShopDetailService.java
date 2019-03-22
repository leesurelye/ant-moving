package com.leesure.service.intl;

import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
public interface ShopDetailService {

    int addShopInfo(ShopInfo shopInfo);


    List<ShopInfo> getShopInfoBuConditions(Map<String,String> conditions);


    ShopDetail getShopDetailById(Long id);

}
