package com.leesure.common.result;

import lombok.Data;

import java.util.List;

/**
 * Created by yue on 2019/3/22.
 * 不包含分页查询的查询结果
 * @author yue
 */
@Data
public class ListResult<T> {

    private String code;

    private String msg;

    private List<T> data;

    private boolean success;


    public ListResult() {
        this.code = "200";
        this.msg="success";
        this.success=true;
    }
}
