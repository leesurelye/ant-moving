package com.leesure.common.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by yue on 2019/2/12.
 * @author yue
 */
@Data
@EqualsAndHashCode
public class PlainResult<T> extends BasicResult<T>{

    private T data;

}
