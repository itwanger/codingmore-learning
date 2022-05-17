package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 标签文章关系表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Post_tag_relation对象", description="标签文章关系表")
public class Post_tag_relation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "对应文章ID")
    @TableId(value = "post_id", type = IdType.AUTO)
    private Long post_id;

    @ApiModelProperty(value = "标签ID")
    private Long post_tag_id;

    @ApiModelProperty(value = "排序")
    private Integer term_order;


    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

    public Long getPost_tag_id() {
        return post_tag_id;
    }

    public void setPost_tag_id(Long post_tag_id) {
        this.post_tag_id = post_tag_id;
    }

    public Integer getTerm_order() {
        return term_order;
    }

    public void setTerm_order(Integer term_order) {
        this.term_order = term_order;
    }

    @Override
    public String toString() {
        return "Post_tag_relation{" +
        "post_id=" + post_id +
        ", post_tag_id=" + post_tag_id +
        ", term_order=" + term_order +
        "}";
    }
}
