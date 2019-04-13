package com.leesure.dao;

import com.leesure.dao.entity.ShopService;
import com.leesure.dao.mybatis.ShopServiceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yue on 2019/3/23.
 * @author yue
 */
@Service
public class ShopServiceDao {

    @Resource
    private ShopServiceMapper mapper;

    public List<ShopService> selectShopServiceByShopId(Long shopId){
        return  mapper.selectShopServiceByShopId(shopId,null,null);
    }

    public List<ShopService> selectShopServicePageination(Long shopId,
                                                          Integer page,
                                                          Integer pageSize){
        return mapper.selectShopServiceByShopId(shopId,page,pageSize);
    }

    public int countService(Long shopId){
        return mapper.countService(shopId);
    }
}
