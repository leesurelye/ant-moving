package com.leesure.service.intl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
public interface ShopDetailService {

    Long addShopInfo(ShopInfo shopInfo)  throws  SystemException ;

    boolean updateShopInfo(ShopInfo shopInfo) throws SystemException;

    List<ShopInfo> getShopInfoBuConditions(Map<String,String> conditions)
            throws SystemException;

    List<ShopInfo> getShopInfoByAddress(String address ,String name)
            throws SystemException;

    ShopDetail getShopDetailById(Long id) throws SystemException;

}
