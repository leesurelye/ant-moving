package com.leesure.service.impl;

import com.leesure.dao.ShopDao;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.mybatis.ShopServiceMapper;
import com.leesure.service.intl.ShopDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
@Service("ShopDetailService")
public class ShopDetailServiceImpl implements ShopDetailService {


    @Autowired
    private ShopDao shopDao;

    @Override
    public int addShopInfo(ShopInfo shopInfo) {
        return 0;
    }

    @Override
    public List<ShopInfo> getShopInfoBuConditions(Map<String, String> conditions) {
        return null;
    }

    @Override
    public ShopDetail getShopDetailById(Long id) {
        return null;
    }
}
