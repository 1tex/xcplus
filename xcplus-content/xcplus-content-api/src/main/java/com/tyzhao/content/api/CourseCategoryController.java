package com.tyzhao.content.api;/**
 * @description TODO
 * @author tex
 * @date 2023/1/30 13:32
 * @version 1.0
 */

import com.tyzhao.content.model.dto.CourseCategoryTreeDto;
import com.tyzhao.content.service.CourseCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: xcplus
 * @package: com.tyzhao.content.api
 * @className: CourseCategoryController
 * @author: tex
 * @description: TODO
 * @date: 2023/1/30 13:32
 * @version: 1.0
 */
@Slf4j
@Api(value = "课程分类相关接口", tags = "课程分类相关接口")
@RestController
public class CourseCategoryController {

    @Autowired
    CourseCategoryService courseCategoryService;

    @ApiOperation("课程分类查询接口")
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryService.queryTreeNodes("1");
        return courseCategoryTreeDtos;
    }

}
