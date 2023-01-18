package com.tyzhao.content.api;

import com.tyzhao.base.model.PageParams;
import com.tyzhao.base.model.PageResult;
import com.tyzhao.model.dto.QueryCourseParamsDto;
import com.tyzhao.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParamsDto){
        CourseBase courseBase = new CourseBase();
        courseBase.setName("测试名称");
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> courseBases = new ArrayList();
        courseBases.add(courseBase);
        PageResult pageResult = new PageResult<CourseBase>(courseBases,10,1,10);
        return pageResult;
    }

}
