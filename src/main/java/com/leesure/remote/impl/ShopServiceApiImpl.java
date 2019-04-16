package com.leesure.remote.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.common.result.ListResult;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Evaluate;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.dao.entity.ShopInfo;
import com.leesure.dao.entity.ShopService;
import com.leesure.remote.intl.ShopServiceApi;
import com.leesure.service.intl.OrderService;
import com.leesure.service.intl.ShopDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yue on 2019/3/22.
 * 商店服务
 * @author yue
 */
@Service("ShopServiceApi")
@Slf4j
public class ShopServiceApiImpl implements ShopServiceApi {

    @Autowired
    private ShopDetailService detailService;

    @Autowired
    private OrderService orderService;


    @Override
    public PlainResult<Long> registerShopInfo(ShopInfo shopInfo) {
        PlainResult<Long> result = new PlainResult<>();
        //check param
        try{
            Long shopId = detailService.addShopInfo(shopInfo);
            result.setData(shopId);
        }catch (SystemException exception){
            result.setMsg(exception.getMessage());
            result.setCode(exception.getCode());
            result.setSuccess(false);
            return result;
        }catch (Exception e){
            result.setMsg(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public PlainResult<Boolean> activeShop(ShopInfo shopInfo){
        PlainResult<Boolean> result = new PlainResult<>();
        try{
            boolean data = detailService.updateShopInfo(shopInfo);
            result.setData(data);
        }catch (SystemException exception){
            result.setCode(exception.getCode());
            result.setMsg(exception.getMessage());
            result.setSuccess(false);
        }catch (Exception e){
            result.setCode(SystemErrorCode.SYSTEM_UNKNOWN_ERROR.getCode());
            result.setMsg(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }


    @Override
    public ListResult<ShopInfo> getShopInfoByCondition(String address,String value) {
        ListResult<ShopInfo> result = new ListResult<>();
        try{
            List<ShopInfo> data = detailService.getShopInfoByAddress(address,value);
            result.setData(data);
        }catch (SystemException exception){
            result.setCode(exception.getCode());
            result.setMsg(exception.getMessage());
        }catch (Exception e){
            result.setCode(SystemErrorCode.SYSTEM_UNKNOWN_ERROR.getCode());
            result.setMsg(e.getMessage());
        }
        return result;
    }

    @Override
    public PlainResult<ShopDetail> getShopDetailById(Long shopId) {
        PlainResult<ShopDetail> result = new PlainResult<>();
        try{
            ShopDetail data = detailService.getShopDetailById(shopId);
            result.setData(data);
        }catch (SystemException exception){
            result.setError(exception);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR.getCode(),
                    e.getMessage());
        }
        return result;
    }

    @Override
    public PageResult<Evaluate> getShopEvaluate(Long shopId, Integer page, Integer pageSize) {
        PageResult<Evaluate> result = new PageResult<>();
        try{
            List<Evaluate> data = detailService.getEvaluateByShopID(shopId, page, pageSize);
            result.setData(data);
            int total = detailService.countEvaluateByShopID(shopId);
            result.setTotalCount(total);
        }catch (SystemException exception){
            result.setError(exception);
            log.error(exception.getMessage(),exception);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }

    @Override
    public PageResult<ShopService> getShopService(Long shopId,
                                                  Integer page,
                                                  Integer pageSize) {
        PageResult<ShopService> result = new PageResult<>();
        try{
            List<ShopService> data = detailService.getShopServiceList(shopId, page, pageSize);
            int total = detailService.countServiceList(shopId);
            result.setData(data);
            result.setTotalCount(total);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e);
            log.error(e.getMessage(),e);
        }
        return result;
    }

    @Override
    public PlainResult<Long> getShopId(Long adminId) {
        PlainResult<Long> result = new PlainResult<>();
        try{
            result.setData(detailService.getShopId(adminId));
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,
                    e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }
}
