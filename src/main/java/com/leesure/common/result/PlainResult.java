package com.leesure.common.result;

import lombok.Data;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
@Data
public class PlainResult<T> {
    public PlainResult() {}

    public PlainResult(String code, String msg, Boolean success) {
        this.code = "200";
        this.msg = "success";
        this.success = true;
    }

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
