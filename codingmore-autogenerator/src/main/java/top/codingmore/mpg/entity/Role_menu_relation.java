package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 后台角色菜单关系表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Role_menu_relation对象", description="后台角色菜单关系表")
public class Role_menu_relation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_menu_relation_id", type = IdType.AUTO)
    private Long role_menu_relation_id;

    @ApiModelProperty(value = "角色ID")
    private Long role_id;

    @ApiModelProperty(value = "菜单ID")
    private Long menu_id;


    public Long getRole_menu_relation_id() {
        return role_menu_relation_id;
    }

    public void setRole_menu_relation_id(Long role_menu_relation_id) {
        this.role_menu_relation_id = role_menu_relation_id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
    }

    @Override
    public String toString() {
        return "Role_menu_relation{" +
        "role_menu_relation_id=" + role_menu_relation_id +
        ", role_id=" + role_id +
        ", menu_id=" + menu_id +
        "}";
    }
}
