package com.leesure.utils;

/**
 * Created by yue on 2019/3/24.
 * 校验码生成器-工厂模式
 * @author yue
 *
 */
public class ValidateCodeFactory {

    public static String getEmailValidateCode(){
        String str1 = "1234567890";
        StringBuilder str2 = new StringBuilder();
        int len = str1.length() - 1;
        double r;
        for (int i = 0; i < 4; i++) {
            r = (Math.random()) * len;
            str2.append(str1.charAt((int) r));
        }
        return str2.toString();
    }
}
