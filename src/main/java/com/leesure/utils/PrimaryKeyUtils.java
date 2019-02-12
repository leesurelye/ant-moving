package com.leesure.utils;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public class PrimaryKeyUtils {

    /**
     * 使用当前时间戳作为id的主键
     * @return
     */
    public static  Long createUserPrimaryId(){
        return  System.currentTimeMillis();
    }
}
