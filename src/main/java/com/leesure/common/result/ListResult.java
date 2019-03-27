package com.leesure.common.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Created by yue on 2019/3/22.
 * 不包含分页查询的查询结果
 * @author yue
 */
@Data
@EqualsAndHashCode
public class ListResult<T> extends BasicResult {

    private List<T> data;
}
