package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 栏目
 * </p>
 *
 * @author 沉默王二
 * @since 2022-02-11
 */
@ApiModel(value="Term_taxonomy对象", description="栏目")
public class Term_taxonomy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "term_taxonomy_id", type = IdType.AUTO)
    private Long term_taxonomy_id;

    @ApiModelProperty(value = "说明")
    private String description;

    @ApiModelProperty(value = "栏目名称")
    private String name;

    @ApiModelProperty(value = "父栏目id")
    private Long parent_id;

    @ApiModelProperty(value = "创建人id")
    private Long create_user_id;

    @ApiModelProperty(value = "创建时间")
    private Date create_time;

    @ApiModelProperty(value = "更新时间")
    private Date update_time;

    @ApiModelProperty(value = "属性")
    private String attribute;


    public Long getTerm_taxonomy_id() {
        return term_taxonomy_id;
    }

    public void setTerm_taxonomy_id(Long term_taxonomy_id) {
        this.term_taxonomy_id = term_taxonomy_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Long getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Term_taxonomy{" +
        "term_taxonomy_id=" + term_taxonomy_id +
        ", description=" + description +
        ", name=" + name +
        ", parent_id=" + parent_id +
        ", create_user_id=" + create_user_id +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", attribute=" + attribute +
        "}";
    }
}
