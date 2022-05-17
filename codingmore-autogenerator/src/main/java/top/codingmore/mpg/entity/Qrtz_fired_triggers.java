package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Qrtz_fired_triggers对象", description="")
public class Qrtz_fired_triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String ENTRY_ID;

    private String TRIGGER_NAME;

    private String TRIGGER_GROUP;

    private String INSTANCE_NAME;

    private Long FIRED_TIME;

    private Long SCHED_TIME;

    private Integer PRIORITY;

    private String STATE;

    private String JOB_NAME;

    private String JOB_GROUP;

    private String IS_NONCONCURRENT;

    private String REQUESTS_RECOVERY;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getENTRY_ID() {
        return ENTRY_ID;
    }

    public void setENTRY_ID(String ENTRY_ID) {
        this.ENTRY_ID = ENTRY_ID;
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

    public String getINSTANCE_NAME() {
        return INSTANCE_NAME;
    }

    public void setINSTANCE_NAME(String INSTANCE_NAME) {
        this.INSTANCE_NAME = INSTANCE_NAME;
    }

    public Long getFIRED_TIME() {
        return FIRED_TIME;
    }

    public void setFIRED_TIME(Long FIRED_TIME) {
        this.FIRED_TIME = FIRED_TIME;
    }

    public Long getSCHED_TIME() {
        return SCHED_TIME;
    }

    public void setSCHED_TIME(Long SCHED_TIME) {
        this.SCHED_TIME = SCHED_TIME;
    }

    public Integer getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(Integer PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
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

    public String getIS_NONCONCURRENT() {
        return IS_NONCONCURRENT;
    }

    public void setIS_NONCONCURRENT(String IS_NONCONCURRENT) {
        this.IS_NONCONCURRENT = IS_NONCONCURRENT;
    }

    public String getREQUESTS_RECOVERY() {
        return REQUESTS_RECOVERY;
    }

    public void setREQUESTS_RECOVERY(String REQUESTS_RECOVERY) {
        this.REQUESTS_RECOVERY = REQUESTS_RECOVERY;
    }

    @Override
    public String toString() {
        return "Qrtz_fired_triggers{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", ENTRY_ID=" + ENTRY_ID +
        ", TRIGGER_NAME=" + TRIGGER_NAME +
        ", TRIGGER_GROUP=" + TRIGGER_GROUP +
        ", INSTANCE_NAME=" + INSTANCE_NAME +
        ", FIRED_TIME=" + FIRED_TIME +
        ", SCHED_TIME=" + SCHED_TIME +
        ", PRIORITY=" + PRIORITY +
        ", STATE=" + STATE +
        ", JOB_NAME=" + JOB_NAME +
        ", JOB_GROUP=" + JOB_GROUP +
        ", IS_NONCONCURRENT=" + IS_NONCONCURRENT +
        ", REQUESTS_RECOVERY=" + REQUESTS_RECOVERY +
        "}";
    }
}
