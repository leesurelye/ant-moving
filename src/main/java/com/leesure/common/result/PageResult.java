package com.leesure.common.result;

import lombok.Data;

import java.util.List;

/**
 * Created by yue on 2019/2/12.
 * 分页
 * @author yue
 */
@Data
public class PageResult<T> {

    /**
     * 当前页
     */
    private int current =1;
    /**
     * 每页显示数目
     */
    private int pageSize =10;
    /**
     * 总 Item 条数
     */
    private int totalCount;
    /**
     * 总页数
     */
    private int totalPage;

    private List<T> data;

}
