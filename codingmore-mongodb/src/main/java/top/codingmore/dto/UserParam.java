package top.codingmore.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 前端参数
 */
@Data
@ApiModel(value="Users对象", description="用户表")
public class UserParam {
    @ApiModelProperty(value = "登录名")
    @NotBlank(message="登录名不能为空")
    private String name;

    @ApiModelProperty(value = "密码")
    @NotBlank(message="密码不能为空")
    private String password;
}
