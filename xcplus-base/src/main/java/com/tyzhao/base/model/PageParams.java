package com.tyzhao.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;

/**
 * @description 分页查询通用参数
 * @author tex
 * @date 2023/1/18 11:30
 * @version 1.0
 */
@Data
@ToString
public class PageParams {
    //当前页码默认值
    public static final long DEFAULT_PAGE_CURRENT = 1L;
    //每页记录数默认值
    public static final long DEFAULT_PAGE_SIZE = 10L;
    @ApiModelProperty(value = "当前页码", example = "1")
    //当前页码
    private Long pageNo = DEFAULT_PAGE_CURRENT;
    @ApiModelProperty(value = "每页记录数", example = "10")
    //每页记录数默认值
    private Long pageSize = DEFAULT_PAGE_SIZE;

    public PageParams(){
    }
    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}