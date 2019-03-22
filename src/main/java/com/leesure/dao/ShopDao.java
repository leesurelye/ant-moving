package com.leesure.dao;

import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.mybatis.ShopDetailMapper;
import com.leesure.dao.mybatis.ShopServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
@Service
public class ShopDao {

    @Autowired
    private ShopDetailMapper detailMapper;

    @Autowired
    private ShopServiceMapper serviceMapper;


    public int insertShopInfo(ShopInfo shopInfo){
        int result = detailMapper.insertShopInfo(shopInfo);
        return result;
    }
}
