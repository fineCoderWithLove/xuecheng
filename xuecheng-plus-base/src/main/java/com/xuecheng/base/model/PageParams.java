package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/17:41
 * @Description:分页查询的参数
 */
@Data
@ToString
public class PageParams {
    //当前页码
    @ApiModelProperty("页码")
    private Long pageNo = 1L;
    //每页显示记录数
    @ApiModelProperty("每页记录数")
    private Long pageSize = 30L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
