package top.codingmore.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Posts对象", description="文章")
@TableName(autoResultMap = true)
@Document(indexName = "posts")
public class EsPosts implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "posts_id")
    @TableId(value = "posts_id", type = IdType.AUTO)
    @Id
    private Long postsId;

    @ApiModelProperty(value = "对应作者ID")
    private Long postAuthor;

    @ApiModelProperty(value = "发布时间")
    private Date postDate;

    @ApiModelProperty(value = "正文")
    private String postContent;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    @ApiModelProperty(value = "标题")
    private String postTitle;

    @ApiModelProperty(value = "摘录")
    private String postExcerpt;

    @ApiModelProperty(value = "文章状态")
    private String postStatus;

    @ApiModelProperty(value = "评论状态")
    private String commentStatus;

    @ApiModelProperty(value = "修改时间")
    private Date postModified;

    @ApiModelProperty(value = "排序ID")
    private Integer menuOrder;

    @ApiModelProperty(value = "文章类型（post/page等）")
    private String postType;

    @ApiModelProperty(value = "评论总数")
    private Long commentCount;

    @ApiModelProperty(value = "浏览量")
    private Long pageView;

    @ApiModelProperty(value = "正文html")
    private String htmlContent;

    @TableField(typeHandler = JacksonTypeHandler.class)
    @ApiModelProperty("属性")
    private Map<String,Object> attribute;

}
