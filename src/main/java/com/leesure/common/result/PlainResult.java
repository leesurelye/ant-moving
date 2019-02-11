package com.leesure.common.result;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
public class PlainResult<T> {
    /**
     * 返回码
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;
    private Boolean success;
    private T data;

}
