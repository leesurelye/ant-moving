package com.leesure.common.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Created by yue on 2019/2/12.
 * 分页
 * @author yue
 */
@Data
@EqualsAndHashCode
public class PageResult<T>  extends BasicResult{


    /**
     * 当前页
     */
    private int current;
    /**
     * 每页显示数目
     */
    private int pageSize;
    /**
     * 总 Item 条数
     */
    private int totalCount;


    private List<T> data;


    public PageResult() {
        this.current=1;
        this.pageSize=10;
    }
}
