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
@ApiModel(value="Qrtz_job_details对象", description="")
public class Qrtz_job_details implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String JOB_NAME;

    private String JOB_GROUP;

    private String DESCRIPTION;

    private String JOB_CLASS_NAME;

    private String IS_DURABLE;

    private String IS_NONCONCURRENT;

    private String IS_UPDATE_DATA;

    private String REQUESTS_RECOVERY;

    private Blob JOB_DATA;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getJOB_NAME() {
        return JOB_NAME;
    }

    public void setJOB_NAME(String JOB_NAME) {
        this.JOB_NAME = JOB_NAME;
    }

    public String getJOB_GROUP() {
        return JOB_GROUP;
    }

    public void setJOB_GROUP(String JOB_GROUP) {
        this.JOB_GROUP = JOB_GROUP;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getJOB_CLASS_NAME() {
        return JOB_CLASS_NAME;
    }

    public void setJOB_CLASS_NAME(String JOB_CLASS_NAME) {
        this.JOB_CLASS_NAME = JOB_CLASS_NAME;
    }

    public String getIS_DURABLE() {
        return IS_DURABLE;
    }

    public void setIS_DURABLE(String IS_DURABLE) {
        this.IS_DURABLE = IS_DURABLE;
    }

    public String getIS_NONCONCURRENT() {
        return IS_NONCONCURRENT;
    }

    public void setIS_NONCONCURRENT(String IS_NONCONCURRENT) {
        this.IS_NONCONCURRENT = IS_NONCONCURRENT;
    }

    public String getIS_UPDATE_DATA() {
        return IS_UPDATE_DATA;
    }

    public void setIS_UPDATE_DATA(String IS_UPDATE_DATA) {
        this.IS_UPDATE_DATA = IS_UPDATE_DATA;
    }

    public String getREQUESTS_RECOVERY() {
        return REQUESTS_RECOVERY;
    }

    public void setREQUESTS_RECOVERY(String REQUESTS_RECOVERY) {
        this.REQUESTS_RECOVERY = REQUESTS_RECOVERY;
    }

    public Blob getJOB_DATA() {
        return JOB_DATA;
    }

    public void setJOB_DATA(Blob JOB_DATA) {
        this.JOB_DATA = JOB_DATA;
    }

    @Override
    public String toString() {
        return "Qrtz_job_details{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", JOB_NAME=" + JOB_NAME +
        ", JOB_GROUP=" + JOB_GROUP +
        ", DESCRIPTION=" + DESCRIPTION +
        ", JOB_CLASS_NAME=" + JOB_CLASS_NAME +
        ", IS_DURABLE=" + IS_DURABLE +
        ", IS_NONCONCURRENT=" + IS_NONCONCURRENT +
        ", IS_UPDATE_DATA=" + IS_UPDATE_DATA +
        ", REQUESTS_RECOVERY=" + REQUESTS_RECOVERY +
        ", JOB_DATA=" + JOB_DATA +
        "}";
    }
}
