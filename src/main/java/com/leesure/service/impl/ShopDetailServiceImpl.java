package com.leesure.service.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.EvaluateDao;
import com.leesure.dao.ShopDao;
import com.leesure.dao.ShopServiceDao;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.entity.ShopService;
import com.leesure.service.intl.ShopDetailService;
import com.leesure.utils.PrimaryKeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 *
 * @author yue
 */
@Service("ShopDetailService")
public class ShopDetailServiceImpl implements ShopDetailService {


    @Autowired
    private ShopDao shopDao;

    @Autowired
    private EvaluateDao evaluateDao;

    @Autowired
    private ShopServiceDao serviceDao;


    @Override
    public Long addShopInfo(ShopInfo shopInfo) throws SystemException {
        shopInfo.setShopId(PrimaryKeyUtils.createShopId());
        int result = shopDao.insertShopInfo(shopInfo);
        if (result == 0) {
            throw new SystemException(SystemErrorCode.SYSTEM_UNKNOWN_ERROR, shopInfo.toString());
        }
        return shopInfo.getShopId();
    }

    @Override
    public boolean updateShopInfo(ShopInfo shopInfo) throws SystemException {
        if (shopInfo.getShopId() == null) {
            throw new SystemException(SystemErrorCode.ID_NOT_EXISTS);
        }
        if (shopInfo.getShopEmail() == null) {
            throw new SystemException(SystemErrorCode.ERROR_PARAM_IS_NULL, "shopEmail");
        }
        int i = shopDao.updateShopInfo(shopInfo);
        return i > 0;
    }

    @Override
    public List<ShopInfo> getShopInfoByConditions(Map<String, String> conditions)
            throws SystemException {
        //如果查询条件为空，则查询所有
        if (CollectionUtils.isEmpty(conditions)) {
            return shopDao.selectAllShopInfo();
        }
        return shopDao.selectShopInfoByCondition(conditions);
    }

    @Override
    public List<ShopInfo> getShopInfoByAddress(String address, String name) {
        return shopDao.selectShopInfoByAddress(address, name);
    }

    @Override
    public ShopDetail getShopDetailById(Long id) throws SystemException {
        ShopDetail shopDetail = shopDao.selectShopDetailById(id);
        if (shopDetail == null) {
            throw new SystemException(SystemErrorCode.ERROR_DATA_IS_NULL);
        }
        List<ShopService> shopServices = serviceDao.selectShopServiceByShopId(id);
        shopDetail.setServiceList(shopServices);
        return shopDetail;
    }

    @Override
    public List<Evaluate> getEvaluateByShopID(Long shopID, int page, int pageSize) {
        Map<String, Long> map = new HashMap<>();
        map.put("shop_id", shopID);
        return evaluateDao.queryEvaluatePagination(map, page,pageSize);
    }

    @Override
    public int countEvaluateByShopID(Long shopID) {
        Map<String, Long> map = new HashMap<>();
        map.put("shop_id", shopID);
        return evaluateDao.countEvaluateByID(map);
    }
}
