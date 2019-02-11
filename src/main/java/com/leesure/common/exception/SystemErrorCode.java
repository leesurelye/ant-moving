package com.leesure.common.exception;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public enum  SystemErrorCode {

    /**
     * system_unknown_error
     */
    SYSTEM_UNKNOWN_ERROR("system_error","Error:[%s]");

    private String code;
    private String msg;



     SystemErrorCode(String code, String msg) {
        this.code=code;
        this.msg=msg;
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
}
