package com.leesure.service.intl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.entity.ShopService;

import java.util.List;
import java.util.Map;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
public interface ShopDetailService {

    Long addShopInfo(ShopInfo shopInfo)  throws  SystemException ;

    boolean updateShopInfo(ShopInfo shopInfo) throws SystemException;

    List<ShopInfo> getShopInfoByConditions(Map<String,String> conditions)
            throws SystemException;

    List<ShopInfo> getShopInfoByAddress(String address ,String name)
            throws SystemException;

    ShopDetail getShopDetailById(Long id) throws SystemException;


    /**
     * 根据不同的id 获取评价单
     * @param shopID key=column name ,value =idValue
     * @return 评价列表
     */
    List<Evaluate> getEvaluateByShopID(Long shopID, Integer page, Integer pageSize)
            throws SystemException;

    /**
     * 根据商店id获取商店评价单
     * @param shopID
     * @return
     */
    int countEvaluateByShopID(Long shopID);


    /**
     * 根据商店ID获取商店服务列表
     * @param shopId 商店ID
     * @param page 当前页面
     * @param pageSize 页面大小
     * @return 服务列表
     */
    List<ShopService> getShopServiceList(Long shopId,Integer page,Integer pageSize);

    /**
     * 获得商店服务数量总数
     * @param shopID 商店ID
     * @return 总数
     */
    int countServiceList(Long shopID);



    long getShopId(Long adminId);
}
