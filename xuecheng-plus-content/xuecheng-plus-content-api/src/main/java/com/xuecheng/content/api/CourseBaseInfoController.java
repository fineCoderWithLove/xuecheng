package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/17:55
 * @Description:
 */
@Api(value = "课程信息管理接口",tags = "课程信息管理接口")
@RestController
public class CourseBaseInfoController {

    @ApiOperation("课程查询的接口")
    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,@RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {
        System.out.println(pageParams);

        return null;
    }
}
