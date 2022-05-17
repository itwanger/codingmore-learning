package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Qrtz_blob_triggers对象", description="")
public class Qrtz_blob_triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String TRIGGER_NAME;

    private String TRIGGER_GROUP;

    private Blob BLOB_DATA;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getTRIGGER_NAME() {
        return TRIGGER_NAME;
    }

    public void setTRIGGER_NAME(String TRIGGER_NAME) {
        this.TRIGGER_NAME = TRIGGER_NAME;
    }

    public String getTRIGGER_GROUP() {
        return TRIGGER_GROUP;
    }

    public void setTRIGGER_GROUP(String TRIGGER_GROUP) {
        this.TRIGGER_GROUP = TRIGGER_GROUP;
    }

    public Blob getBLOB_DATA() {
        return BLOB_DATA;
    }

    public void setBLOB_DATA(Blob BLOB_DATA) {
        this.BLOB_DATA = BLOB_DATA;
    }

    @Override
    public String toString() {
        return "Qrtz_blob_triggers{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", TRIGGER_NAME=" + TRIGGER_NAME +
        ", TRIGGER_GROUP=" + TRIGGER_GROUP +
        ", BLOB_DATA=" + BLOB_DATA +
        "}";
    }
}
