package com.tyzhao.content.service;

import com.tyzhao.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author tex
 * @version 1.0
 * @description 课程分类操作相关的service
 * @date 2023/1/30 15:12
 */
public interface CourseCategoryService {

    /**
     * 课程分类查询
     * @param id 根节点id
     * @return 根节点下面所有子节点
     */
    List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
