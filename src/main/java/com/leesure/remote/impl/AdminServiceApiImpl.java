package com.leesure.remote.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Admin;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.ShopDetail;
import com.leesure.remote.intl.AdminServiceApi;
import com.leesure.service.intl.AdminService;
import com.leesure.service.intl.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
@Service("AdminServiceApi")
@Slf4j
public class AdminServiceApiImpl implements AdminServiceApi {

    @Autowired
    private AdminService adminService;


    @Autowired
    private OrderService orderService;

    @Override
    public PlainResult<Boolean> login(String name, String password) {
        PlainResult<Boolean> result = new PlainResult<>();
        //todo result
        return result;
    }

    @Override
    public PlainResult<Boolean> register(Admin admin) {
        return null;
    }

    @Override
    public PlainResult<Long> registerShop(Long accountId, ShopDetail shopDetail) {
        return null;
    }

    @Override
    public PlainResult<Boolean> updateShopInfo(ShopDetail shopDetail) {
        return null;
    }

    @Override
    public PlainResult<Boolean> closeOrder(Long id) {
        PlainResult<Boolean> result = new PlainResult<>();
        try{
            boolean data = adminService.closeOrder(id);
            result.setData(data);
        }catch (SystemException exception){
            result.setError(exception.getCode(),exception.getMessage());
            log.error(exception.getMessage(),exception);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }

    @Override
    public PageResult<Order> getOrderList(Long shopId, Integer page, Integer pageSize) {
        PageResult<Order> result = new PageResult<>();
        try{
            List<Order> data = adminService.queryOrderList(shopId, page, pageSize);
            result.setData(data);
            int total = adminService.countOrderList(shopId);
            result.setTotalCount(total);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }
}
