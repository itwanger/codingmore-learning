package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Comments对象", description="评论表")
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "comment_id", type = IdType.AUTO)
    private Long comment_id;

    @ApiModelProperty(value = "对应文章ID")
    private Long comment_post_id;

    @ApiModelProperty(value = "评论者")
    private String comment_author;

    @ApiModelProperty(value = "评论者邮箱")
    private String comment_author_email;

    @ApiModelProperty(value = "评论者网址")
    private String comment_author_url;

    @ApiModelProperty(value = "评论者IP")
    private String comment_author_ip;

    @ApiModelProperty(value = "评论时间")
    private Date comment_date;

    @ApiModelProperty(value = "评论正文")
    private String comment_content;

    @ApiModelProperty(value = "评论是否被批准")
    private String comment_approved;

    @ApiModelProperty(value = "评论者的USER AGENT")
    private String comment_agent;

    @ApiModelProperty(value = "评论类型(pingback/普通)")
    private String comment_type;

    @ApiModelProperty(value = "父评论ID")
    private Long comment_parent;

    @ApiModelProperty(value = "评论者用户ID（不一定存在）")
    private Long user_id;


    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public Long getComment_post_id() {
        return comment_post_id;
    }

    public void setComment_post_id(Long comment_post_id) {
        this.comment_post_id = comment_post_id;
    }

    public String getComment_author() {
        return comment_author;
    }

    public void setComment_author(String comment_author) {
        this.comment_author = comment_author;
    }

    public String getComment_author_email() {
        return comment_author_email;
    }

    public void setComment_author_email(String comment_author_email) {
        this.comment_author_email = comment_author_email;
    }

    public String getComment_author_url() {
        return comment_author_url;
    }

    public void setComment_author_url(String comment_author_url) {
        this.comment_author_url = comment_author_url;
    }

    public String getComment_author_ip() {
        return comment_author_ip;
    }

    public void setComment_author_ip(String comment_author_ip) {
        this.comment_author_ip = comment_author_ip;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getComment_approved() {
        return comment_approved;
    }

    public void setComment_approved(String comment_approved) {
        this.comment_approved = comment_approved;
    }

    public String getComment_agent() {
        return comment_agent;
    }

    public void setComment_agent(String comment_agent) {
        this.comment_agent = comment_agent;
    }

    public String getComment_type() {
        return comment_type;
    }

    public void setComment_type(String comment_type) {
        this.comment_type = comment_type;
    }

    public Long getComment_parent() {
        return comment_parent;
    }

    public void setComment_parent(Long comment_parent) {
        this.comment_parent = comment_parent;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Comments{" +
        "comment_id=" + comment_id +
        ", comment_post_id=" + comment_post_id +
        ", comment_author=" + comment_author +
        ", comment_author_email=" + comment_author_email +
        ", comment_author_url=" + comment_author_url +
        ", comment_author_ip=" + comment_author_ip +
        ", comment_date=" + comment_date +
        ", comment_content=" + comment_content +
        ", comment_approved=" + comment_approved +
        ", comment_agent=" + comment_agent +
        ", comment_type=" + comment_type +
        ", comment_parent=" + comment_parent +
        ", user_id=" + user_id +
        "}";
    }
}
