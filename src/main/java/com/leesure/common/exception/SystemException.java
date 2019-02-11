package com.leesure.common.exception;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public class SystemException extends Exception {

    private String code;
    private String message;


    public SystemException(String message) {
        super(message);
    }

    public SystemException() {
    }

    public SystemException(SystemErrorCode code) {
        super(code.getCode());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

