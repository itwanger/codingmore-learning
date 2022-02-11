package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author 沉默王二
 * @since 2022-02-11
 */
@ApiModel(value="Posts对象", description="文章")
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "posts_id")
    @TableId(value = "posts_id", type = IdType.AUTO)
    private Long posts_id;

    @ApiModelProperty(value = "对应作者ID")
    private Long post_author;

    @ApiModelProperty(value = "发布时间")
    private Date post_date;

    @ApiModelProperty(value = "正文")
    private String post_content;

    @ApiModelProperty(value = "标题")
    private String post_title;

    @ApiModelProperty(value = "摘录")
    private String post_excerpt;

    @ApiModelProperty(value = "文章状态")
    private String post_status;

    @ApiModelProperty(value = "评论状态")
    private String comment_status;

    @ApiModelProperty(value = "修改时间")
    private Date post_modified;

    @ApiModelProperty(value = "排序ID")
    private Integer menu_order;

    @ApiModelProperty(value = "文章类型（post/page等）")
    private String post_type;

    @ApiModelProperty(value = "评论总数")
    private Long comment_count;

    @ApiModelProperty(value = "属性")
    private String attribute;


    public Long getPosts_id() {
        return posts_id;
    }

    public void setPosts_id(Long posts_id) {
        this.posts_id = posts_id;
    }

    public Long getPost_author() {
        return post_author;
    }

    public void setPost_author(Long post_author) {
        this.post_author = post_author;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_excerpt() {
        return post_excerpt;
    }

    public void setPost_excerpt(String post_excerpt) {
        this.post_excerpt = post_excerpt;
    }

    public String getPost_status() {
        return post_status;
    }

    public void setPost_status(String post_status) {
        this.post_status = post_status;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public Date getPost_modified() {
        return post_modified;
    }

    public void setPost_modified(Date post_modified) {
        this.post_modified = post_modified;
    }

    public Integer getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(Integer menu_order) {
        this.menu_order = menu_order;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public Long getComment_count() {
        return comment_count;
    }

    public void setComment_count(Long comment_count) {
        this.comment_count = comment_count;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Posts{" +
        "posts_id=" + posts_id +
        ", post_author=" + post_author +
        ", post_date=" + post_date +
        ", post_content=" + post_content +
        ", post_title=" + post_title +
        ", post_excerpt=" + post_excerpt +
        ", post_status=" + post_status +
        ", comment_status=" + comment_status +
        ", post_modified=" + post_modified +
        ", menu_order=" + menu_order +
        ", post_type=" + post_type +
        ", comment_count=" + comment_count +
        ", attribute=" + attribute +
        "}";
    }
}
