package com.tyzhao.model.dto;

import lombok.Data;

/**
 * @description 课程查询参数DTO
 * @author tex
 * @date 2023/1/18 11:50
 * @version 1.0
 */
@Data
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
