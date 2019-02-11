package com.leesure.common.exception;

/**
 * Created by yue on 2019/2/11.
 * @author yue
 */
public class SystemException extends Exception {


    public SystemException(String message) {
        super(message);
    }

    public SystemException() {
    }

    public SystemException(SystemErrorCode code) {
        super(code.getCode());
    }
}

