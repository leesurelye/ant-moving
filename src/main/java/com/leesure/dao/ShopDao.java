package com.leesure.dao;

import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.mybatis.ShopDetailMapper;
import com.leesure.dao.mybatis.ShopServiceMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
@Service
public class ShopDao {

    @Resource
    private ShopDetailMapper detailMapper;

    @Resource
    private ShopServiceMapper serviceMapper;


    public int insertShopInfo(ShopInfo shopInfo){
        return  detailMapper.insertShopInfo(shopInfo);
    }


    public int updateShopInfo(ShopInfo shopInfo){
        return detailMapper.updateShopInfo(shopInfo);
    }

    /**
     * 查询所有的商店基本信息
     * @return
     */
    public List<ShopInfo> selectAllShopInfo(){
        List<ShopInfo> shopInfo = detailMapper.selectAllShopInfo();
        return shopInfo;
    }

    public List<ShopInfo> selectShopInfoByCondition(Map<String,String> conditions){
        return detailMapper.selectShopInfoByConditions(conditions);
    }

    public List<ShopInfo> selectShopInfoByAddress(String address,String name){
        address = StringUtils.isEmpty(address)?"% ":"%"+address+"%";
        name = StringUtils.isEmpty(name)?"%":"%"+name+"%";
        return detailMapper.selectShopInfoByAddress(address,name);
    }

    public ShopDetail selectShopDetailById(Long shopId){
        return detailMapper.selectOne(shopId);
    }


}
