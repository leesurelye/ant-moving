package com.leesure.common.result;

import com.leesure.common.exception.SystemErrorCode;
import lombok.Data;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
@Data
public class PlainResult<T> {
    public PlainResult() {
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

    /**
     * set Error msg
     * @param error errorCode
     * @param object errorMessage
     */
    public PlainResult<T> setError(SystemErrorCode error, Object object){
        this.msg=String.format(error.getMsg(),object);
        this.code = error.getCode();
        this.success=false;
        return this;
    }

    /**
     * 不建议使用
     * @param error 错误码
     * @param object 异常消息体
     * @return 返回结果
     */
    public PlainResult<T> setError(String error,Object object){
        this.msg=String.format(error,object);
        this.code = error;
        this.success=false;
        return this;
    }
}
