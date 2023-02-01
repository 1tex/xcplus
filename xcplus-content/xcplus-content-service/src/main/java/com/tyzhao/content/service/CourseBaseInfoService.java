package com.tyzhao.content.service;

import com.tyzhao.base.model.PageParams;
import com.tyzhao.base.model.PageResult;
import com.tyzhao.content.model.dto.AddCourseDto;
import com.tyzhao.content.model.dto.CourseBaseInfoDto;
import com.tyzhao.content.model.dto.QueryCourseParamsDto;
import com.tyzhao.content.model.po.CourseBase;

/**
 * @author tex
 * @version 1.0
 * @description 课程管理service
 * @date 2023/1/29 17:51
 */
public interface CourseBaseInfoService {

    /**
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 条件条件
     * @return
     * @author Mr.M
     * @date 2022/9/6 21:44
     */
    public PageResult<CourseBase>  queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 培训机构id
     * @param addCourseDto 新增课程信息
     * @return 课程信息包括基本信息、营销信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
