package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-02-11
 */
@ApiModel(value="Post_tag对象", description="标签表")
public class Post_tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "post_tag_id")
    @TableId(value = "post_tag_id", type = IdType.AUTO)
    private Long post_tag_id;

    @ApiModelProperty(value = "标签名称")
    private String description;


    public Long getPost_tag_id() {
        return post_tag_id;
    }

    public void setPost_tag_id(Long post_tag_id) {
        this.post_tag_id = post_tag_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post_tag{" +
        "post_tag_id=" + post_tag_id +
        ", description=" + description +
        "}";
    }
}
