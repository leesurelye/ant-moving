package com.leesure.common.exception;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public enum  SystemErrorCode {

    /**
     * system_unknown_error
     */
    SYSTEM_UNKNOWN_ERROR("system_error","Error:[%s]"),
    USER_NOT_EXISTS("user_not_exists","用户[%s]不存在"),
    PASSWORD_ERROR("error_password","账户密码错误"),
    ID_NOT_EXISTS("id_not_exists","ID 不能为空"),
    ERROR_PARAM_IS_NULL("error_param_is_null","[%s] 不能为空"),
    ERROR_DATA_IS_NULL("error_data_is_null","查询结果为空"),
    MISS_PARAM("miss_param","[%s]为空");

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
