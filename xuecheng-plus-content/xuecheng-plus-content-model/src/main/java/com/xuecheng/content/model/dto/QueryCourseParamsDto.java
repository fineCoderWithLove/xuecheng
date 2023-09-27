package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/17:44
 * @Description:课程查询条件模型类
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;

    //课程名称
    private String courseName;

    //发布状态
    private String publishStatus;
}
