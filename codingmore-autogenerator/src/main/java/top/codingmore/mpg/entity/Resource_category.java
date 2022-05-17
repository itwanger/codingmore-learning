package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 资源分类表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Resource_category对象", description="资源分类表")
public class Resource_category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "resource_category_id", type = IdType.AUTO)
    private Long resource_category_id;

    @ApiModelProperty(value = "创建时间")
    private Date create_time;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "排序")
    private Integer sort;


    public Long getResource_category_id() {
        return resource_category_id;
    }

    public void setResource_category_id(Long resource_category_id) {
        this.resource_category_id = resource_category_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Resource_category{" +
        "resource_category_id=" + resource_category_id +
        ", create_time=" + create_time +
        ", name=" + name +
        ", sort=" + sort +
        "}";
    }
}
