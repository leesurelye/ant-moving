package com.leesure.utils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public class PrimaryKeyUtils {


    private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

    /**
     * 使用当前时间戳作为id的主键
     * @return
     */
    public static  Long createUserPrimaryId(){
        return  System.currentTimeMillis();
    }

    /**
     * 创建商店id
     * @return 新的商店id
     */
    public static Long createShopId(){
        String format = PrimaryKeyUtils.format.format(new Date());

        Random random = new Random();
        int ran = random.nextInt(100);
        return Long.parseLong(format+ran);
    }



    public static  Long createOrderId(Long userId,Long serviceId){
        String format = PrimaryKeyUtils.format.format(new Date());

        Random random = new Random();
        int ran =random.nextInt(100);
        return userId+serviceId+ran+Long.parseLong(format);
    }


}
