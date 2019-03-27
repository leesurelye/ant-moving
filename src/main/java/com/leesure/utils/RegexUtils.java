package com.leesure.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式检验
 * Created by yue on 2019/3/24.
 * @author yue
 */
public class RegexUtils {

    private static String EMAIL_REGEX  = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*" ;

    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
