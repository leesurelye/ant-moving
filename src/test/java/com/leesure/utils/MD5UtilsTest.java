package com.leesure.utils;

import org.junit.Test;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public class MD5UtilsTest{

    @Test
    public void TestGetMD5(){
        try{
            MD5Utils utils = new MD5Utils();
            String md5 = utils.getMD5("123");
            System.out.println(md5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
