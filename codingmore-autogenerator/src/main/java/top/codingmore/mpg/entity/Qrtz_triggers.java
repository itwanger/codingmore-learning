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
@ApiModel(value="Qrtz_triggers对象", description="")
public class Qrtz_triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String TRIGGER_NAME;

    private String TRIGGER_GROUP;

    private String JOB_NAME;

    private String JOB_GROUP;

    private String DESCRIPTION;

    private Long NEXT_FIRE_TIME;

    private Long PREV_FIRE_TIME;

    private Integer PRIORITY;

    private String TRIGGER_STATE;

    private String TRIGGER_TYPE;

    private Long START_TIME;

    private Long END_TIME;

    private String CALENDAR_NAME;

    private Integer MISFIRE_INSTR;

    private Blob JOB_DATA;


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

    public Long getNEXT_FIRE_TIME() {
        return NEXT_FIRE_TIME;
    }

    public void setNEXT_FIRE_TIME(Long NEXT_FIRE_TIME) {
        this.NEXT_FIRE_TIME = NEXT_FIRE_TIME;
    }

    public Long getPREV_FIRE_TIME() {
        return PREV_FIRE_TIME;
    }

    public void setPREV_FIRE_TIME(Long PREV_FIRE_TIME) {
        this.PREV_FIRE_TIME = PREV_FIRE_TIME;
    }

    public Integer getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(Integer PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getTRIGGER_STATE() {
        return TRIGGER_STATE;
    }

    public void setTRIGGER_STATE(String TRIGGER_STATE) {
        this.TRIGGER_STATE = TRIGGER_STATE;
    }

    public String getTRIGGER_TYPE() {
        return TRIGGER_TYPE;
    }

    public void setTRIGGER_TYPE(String TRIGGER_TYPE) {
        this.TRIGGER_TYPE = TRIGGER_TYPE;
    }

    public Long getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(Long START_TIME) {
        this.START_TIME = START_TIME;
    }

    public Long getEND_TIME() {
        return END_TIME;
    }

    public void setEND_TIME(Long END_TIME) {
        this.END_TIME = END_TIME;
    }

    public String getCALENDAR_NAME() {
        return CALENDAR_NAME;
    }

    public void setCALENDAR_NAME(String CALENDAR_NAME) {
        this.CALENDAR_NAME = CALENDAR_NAME;
    }

    public Integer getMISFIRE_INSTR() {
        return MISFIRE_INSTR;
    }

    public void setMISFIRE_INSTR(Integer MISFIRE_INSTR) {
        this.MISFIRE_INSTR = MISFIRE_INSTR;
    }

    public Blob getJOB_DATA() {
        return JOB_DATA;
    }

    public void setJOB_DATA(Blob JOB_DATA) {
        this.JOB_DATA = JOB_DATA;
    }

    @Override
    public String toString() {
        return "Qrtz_triggers{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", TRIGGER_NAME=" + TRIGGER_NAME +
        ", TRIGGER_GROUP=" + TRIGGER_GROUP +
        ", JOB_NAME=" + JOB_NAME +
        ", JOB_GROUP=" + JOB_GROUP +
        ", DESCRIPTION=" + DESCRIPTION +
        ", NEXT_FIRE_TIME=" + NEXT_FIRE_TIME +
        ", PREV_FIRE_TIME=" + PREV_FIRE_TIME +
        ", PRIORITY=" + PRIORITY +
        ", TRIGGER_STATE=" + TRIGGER_STATE +
        ", TRIGGER_TYPE=" + TRIGGER_TYPE +
        ", START_TIME=" + START_TIME +
        ", END_TIME=" + END_TIME +
        ", CALENDAR_NAME=" + CALENDAR_NAME +
        ", MISFIRE_INSTR=" + MISFIRE_INSTR +
        ", JOB_DATA=" + JOB_DATA +
        "}";
    }
}
