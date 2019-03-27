package com.leesure.common.result;

import com.leesure.common.exception.SystemErrorCode;
import com.leesure.common.exception.SystemException;

import java.io.Serializable;

/**
 * Created by yue on 2019/3/27.
 * @author yue
 */

public class BasicResult<T> implements Serializable{

    private String code;

    private String msg;

    private Boolean success;

    public BasicResult() {
        this.code="200";
        this.success=true;
        this.msg="success";
    }


    public BasicResult setError(SystemErrorCode error,Object object){
        this.msg = String.format(error.getMsg(),object);
        this.code=error.getCode();
        this.success=false;
        return this;
    }

    public BasicResult setError(String error,Object object){
        this.msg =String.format(error,object);
        this.code=error;
        this.success=false;
        return this;
    }

    public BasicResult setError(SystemException exception){
        this.code =exception.getCode();
        this.msg =exception.getMessage();
        this.success=false;
        return this;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
