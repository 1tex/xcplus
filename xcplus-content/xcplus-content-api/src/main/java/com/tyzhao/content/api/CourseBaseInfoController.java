package com.tyzhao.content.api;

import com.tyzhao.base.model.PageParams;
import com.tyzhao.base.model.PageResult;
import com.tyzhao.content.model.dto.QueryCourseParamsDto;
import com.tyzhao.content.model.po.CourseBase;
import com.tyzhao.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tex
 * @version 1.0
 * @description TODO
 * @date 2023/1/18 17:35
 */
@Api(value = "课程管理相关的接口", tags = "课程管理相关的接口")
@RestController
public class CourseBaseInfoController {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams params, @RequestBody QueryCourseParamsDto queryCourseParamsDto){
        //调用service获取数据
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(params, queryCourseParamsDto);
        return  courseBasePageResult;
    }

}
