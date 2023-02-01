package com.tyzhao.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyzhao.content.model.dto.CourseCategoryTreeDto;
import com.tyzhao.content.model.po.CourseCategory;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author itcast
 */
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    List<CourseCategoryTreeDto> selectTreeNodes(String id);
}
