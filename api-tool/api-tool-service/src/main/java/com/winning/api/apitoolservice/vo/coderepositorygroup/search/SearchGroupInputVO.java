package com.winning.api.apitoolservice.vo.coderepositorygroup.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <p>api-tool</p>
 * 查询分组信息
 * @author cq
 * @Description
 * @date 2020/7/28 15:41
 */
@Data
@ApiModel(value = "SearchGroupInputVO",description = "查询分组信息入参")
public class SearchGroupInputVO {

    @NotNull(message = "代码仓库标识不为空")
    @ApiModelProperty(value = "代码仓库标识",position = 10)
    private Long codeRepositoryId;


}
