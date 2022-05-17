package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文章栏目关系表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Term_relationships对象", description="文章栏目关系表")
public class Term_relationships implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "对应文章ID/链接ID")
    @TableId(value = "term_relationships_id", type = IdType.AUTO)
    private Long term_relationships_id;

    @ApiModelProperty(value = "栏目ID")
    private Long term_taxonomy_id;

    @ApiModelProperty(value = "排序")
    private Integer term_order;

    @ApiModelProperty(value = "类型,0:内容,1:链接")
    private Integer type;


    public Long getTerm_relationships_id() {
        return term_relationships_id;
    }

    public void setTerm_relationships_id(Long term_relationships_id) {
        this.term_relationships_id = term_relationships_id;
    }

    public Long getTerm_taxonomy_id() {
        return term_taxonomy_id;
    }

    public void setTerm_taxonomy_id(Long term_taxonomy_id) {
        this.term_taxonomy_id = term_taxonomy_id;
    }

    public Integer getTerm_order() {
        return term_order;
    }

    public void setTerm_order(Integer term_order) {
        this.term_order = term_order;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Term_relationships{" +
        "term_relationships_id=" + term_relationships_id +
        ", term_taxonomy_id=" + term_taxonomy_id +
        ", term_order=" + term_order +
        ", type=" + type +
        "}";
    }
}
