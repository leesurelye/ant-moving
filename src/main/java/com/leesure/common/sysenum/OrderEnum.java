package com.leesure.common.sysenum;

/**
 * Created by yue on 2019/3/15.
 * @author yue
 */
public enum OrderEnum {

    CLOSE(4,"close");


    private String status;
    private Integer code;


    OrderEnum(Integer code,String status){
        this.code = code;
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
