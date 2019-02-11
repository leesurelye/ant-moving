package com.leesure.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by yue on 2019/2/12.
 * MD5加密工具
 * @author yue
 */
public class MD5Utils {

    public  static  String getMD5(String code) throws Exception{
        MessageDigest md=  MessageDigest.getInstance("MD5");
        md.update(code.getBytes());
        return new BigInteger(1,md.digest()).toString(16);
    }
}
