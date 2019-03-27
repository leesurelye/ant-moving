package com.leesure.remote.intl;

import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.Order;
import com.leesure.dao.entity.User;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public interface UserServiceApi {

    /**
     * 注册用户
     * @param user user
     * @return isSuccess
     */
    PlainResult<Boolean> register(User user);


    /**
     * 用户登陆
     * @return isSuccess
     */
    PlainResult<User> login(String account,String password);


    /**
     * 通过验证邮件的形式发送验证码，修改密码
     * @param newPwd 新密码
     *
     * @return 是否修改成功
     */
    PlainResult<Boolean> changePassword(Long userId,String newPwd);


    /**
     * 更改个人基本信息，不包含更新密码
     * @param user 新的用户基本信息
     * @return 是否成功
     */
    PlainResult<Boolean> updateInfo(User user);


    /**
     * 获取个人历史订单纪录
     * @param pageSize  页面大小
     * @param page 当前页面
     * @param userId 用户id
     * @return 订单纪录
     */
    PageResult<Order> getOrderList(Long userId,Integer page,Integer pageSize) ;

    /**
     * 创建订单信息
     * @param order 订单信息
     * @return 返回创建的订单信息
     */
    PlainResult<Order> createOrder(Order order);



    PlainResult<Boolean> submitOrder(Long orderId);
    /**
     * 删除订单 - 逻辑删除
     * @param orderId 订单Id
     * @return 返回结果
     */
    PlainResult<Boolean> removeOrder(Long orderId);

}
