package com.leesure.remote.impl;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.common.sysenum.OrderEnum;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.User;
import com.leesure.remote.intl.UserServiceApi;
import com.leesure.service.intl.OrderService;
import com.leesure.service.intl.UserService;
import com.leesure.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
@Service("UserServiceApi")
@Slf4j
public class UserServiceApiImpl implements UserServiceApi {

    @Autowired
    private UserService userService;


    @Autowired
    private OrderService orderService;

    @Override
    public PlainResult<Boolean> register(User user) {
        PlainResult<Boolean> result  = new PlainResult<>();
        try{
            String encrypt = MD5Utils.getMD5(user.getPassword());
            user.setPassword(encrypt);
            int data = userService.addUser(user);
            result.setData(data>0);
        } catch (Exception e){
            result.setData(false);
            result.setMsg(e.getMessage());
            log.error("register User is Exception:{}",e.getMessage());
        }
        return result;
    }

    @Override
    public PlainResult<User> login(String account,String password) {
        PlainResult<User> result = new PlainResult<>();
        try{
            User user = userService.userLogin(account,MD5Utils.getMD5(password));
            result.setData(user);
        }catch (SystemException se){
            result.setError(se.getCode(),se.getMessage());
        } catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,
                    e.getMessage());
            log.error("User login Exception{}",e.getMessage());
        }
        return result;
    }

    @Override
    public PlainResult<Boolean> changePassword(Long userId,String newPwd) {
        PlainResult<Boolean> result = new PlainResult<>();
        try{
            //密码加密
            String pwd = MD5Utils.getMD5(newPwd);
            boolean data = userService.changePassword(userId, pwd);
            result.setData(data);
        }catch (SystemException exception){
            result.setError(exception.getCode(),exception.getMessage());
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,
                    e.getMessage());
        }
        return result;
    }

    @Override
    public PlainResult<Boolean> updateUserInfo(User user) {
        PlainResult<Boolean> result = new PlainResult<>();
        try{
            boolean data = userService.updateUserBasicInfo(user);
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
    public PageResult<Order> getOrderList(Long userId,Integer page,Integer pageSize) {
        PageResult<Order> result = new PageResult<>();

        try{
            List<Order> data = orderService.queryOrderPagination(page, pageSize,userId);
            result.setData(data);
            int total = orderService.countOrder(userId);
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
    public PlainResult<Order> createOrder(Order order) {
        PlainResult<Order> result = new PlainResult<>();
        try{
            Order data = orderService.addOrder(order);
            result.setData(data);
        }catch (SystemException exception){
            result.setError(exception.getCode(),exception.getMessage());
            log.error(exception.getMessage());
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,
                    e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }

    @Override
    public PlainResult<Boolean> submitOrder(Long orderId) {
        PlainResult<Boolean> result = new PlainResult<>();
        try{
            boolean data = orderService.updateOrderState(orderId, OrderEnum.COMMIT);
            result.setData(data);
            result.setSuccess(data);
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
    public PlainResult<Boolean> removeOrder(Long orderId) {
        PlainResult<Boolean> result= new PlainResult<>();
        try{
            boolean data = orderService.deleteOrderById(orderId);
            result.setData(data);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }

    @Override
    public PlainResult<User> getUserInfo(Long userID) {
        PlainResult<User>  result=new PlainResult<>();
        try{
            User data = userService.queryUserById(userID);
            result.setData(data);
        }catch (Exception e){
            result.setError(SystemErrorCode.SYSTEM_UNKNOWN_ERROR,e.getMessage());
            log.error(e.getMessage(),e);
        }
        return result;
    }
}
