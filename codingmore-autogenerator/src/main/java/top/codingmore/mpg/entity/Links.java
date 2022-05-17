package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 链接信息表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Links对象", description="链接信息表")
public class Links implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "link_id", type = IdType.AUTO)
    private Long link_id;

    @ApiModelProperty(value = "链接URL")
    private String link_url;

    @ApiModelProperty(value = "链接标题")
    private String link_name;

    @ApiModelProperty(value = "链接图片")
    private String link_image;

    @ApiModelProperty(value = "链接打开方式")
    private String link_target;

    @ApiModelProperty(value = "链接描述")
    private String link_description;

    @ApiModelProperty(value = "是否可见（Y/N）")
    private String link_visible;

    @ApiModelProperty(value = "添加者用户ID")
    private Long link_owner;


    public Long getLink_id() {
        return link_id;
    }

    public void setLink_id(Long link_id) {
        this.link_id = link_id;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_image() {
        return link_image;
    }

    public void setLink_image(String link_image) {
        this.link_image = link_image;
    }

    public String getLink_target() {
        return link_target;
    }

    public void setLink_target(String link_target) {
        this.link_target = link_target;
    }

    public String getLink_description() {
        return link_description;
    }

    public void setLink_description(String link_description) {
        this.link_description = link_description;
    }

    public String getLink_visible() {
        return link_visible;
    }

    public void setLink_visible(String link_visible) {
        this.link_visible = link_visible;
    }

    public Long getLink_owner() {
        return link_owner;
    }

    public void setLink_owner(Long link_owner) {
        this.link_owner = link_owner;
    }

    @Override
    public String toString() {
        return "Links{" +
        "link_id=" + link_id +
        ", link_url=" + link_url +
        ", link_name=" + link_name +
        ", link_image=" + link_image +
        ", link_target=" + link_target +
        ", link_description=" + link_description +
        ", link_visible=" + link_visible +
        ", link_owner=" + link_owner +
        "}";
    }
}
