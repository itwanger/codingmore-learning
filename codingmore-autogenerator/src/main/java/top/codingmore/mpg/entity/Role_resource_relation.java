package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 后台角色资源关系表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Role_resource_relation对象", description="后台角色资源关系表")
public class Role_resource_relation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_resource_relation_id", type = IdType.AUTO)
    private Long role_resource_relation_id;

    @ApiModelProperty(value = "角色ID")
    private Long role_id;

    @ApiModelProperty(value = "资源ID")
    private Long resource_id;


    public Long getRole_resource_relation_id() {
        return role_resource_relation_id;
    }

    public void setRole_resource_relation_id(Long role_resource_relation_id) {
        this.role_resource_relation_id = role_resource_relation_id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getResource_id() {
        return resource_id;
    }

    public void setResource_id(Long resource_id) {
        this.resource_id = resource_id;
    }

    @Override
    public String toString() {
        return "Role_resource_relation{" +
        "role_resource_relation_id=" + role_resource_relation_id +
        ", role_id=" + role_id +
        ", resource_id=" + resource_id +
        "}";
    }
}
