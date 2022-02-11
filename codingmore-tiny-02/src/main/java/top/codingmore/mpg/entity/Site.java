package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 站点配置
 * </p>
 *
 * @author 沉默王二
 * @since 2022-02-11
 */
@ApiModel(value="Site对象", description="站点配置")
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "site_id")
    @TableId(value = "site_id", type = IdType.AUTO)
    private Long site_id;

    @ApiModelProperty(value = "名称")
    private String site_name;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "介绍")
    private String site_desc;

    @ApiModelProperty(value = "属性")
    private String attribute;

    @ApiModelProperty(value = "更新时间")
    private Date update_time;


    public Long getSite_id() {
        return site_id;
    }

    public void setSite_id(Long site_id) {
        this.site_id = site_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSite_desc() {
        return site_desc;
    }

    public void setSite_desc(String site_desc) {
        this.site_desc = site_desc;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Site{" +
        "site_id=" + site_id +
        ", site_name=" + site_name +
        ", keywords=" + keywords +
        ", site_desc=" + site_desc +
        ", attribute=" + attribute +
        ", update_time=" + update_time +
        "}";
    }
}
