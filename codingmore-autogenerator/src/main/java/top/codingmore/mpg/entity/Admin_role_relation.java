package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 后台用户和角色关系表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Admin_role_relation对象", description="后台用户和角色关系表")
public class Admin_role_relation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "admin_role_relation_id", type = IdType.AUTO)
    private Long admin_role_relation_id;

    @ApiModelProperty(value = "用户id")
    private Long users_id;

    @ApiModelProperty(value = "角色id")
    private Long role_id;


    public Long getAdmin_role_relation_id() {
        return admin_role_relation_id;
    }

    public void setAdmin_role_relation_id(Long admin_role_relation_id) {
        this.admin_role_relation_id = admin_role_relation_id;
    }

    public Long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Long users_id) {
        this.users_id = users_id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Admin_role_relation{" +
        "admin_role_relation_id=" + admin_role_relation_id +
        ", users_id=" + users_id +
        ", role_id=" + role_id +
        "}";
    }
}
