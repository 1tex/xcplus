package com.tyzhao.content.model.dto;
/**
 * @description TODO
 * @author tex
 * @date 2023/1/30 13:39
 * @version 1.0
 */

import com.tyzhao.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @projectName: xcplus
 * @package: com.tyzhao.content.model.dto
 * @className: CourseCategoryTreeDto
 * @author: tex
 * @description: TODO
 * @date: 2023/1/30 13:39
 * @version: 1.0
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
