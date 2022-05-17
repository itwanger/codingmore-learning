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
@ApiModel(value="Qrtz_simple_triggers对象", description="")
public class Qrtz_simple_triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String TRIGGER_NAME;

    private String TRIGGER_GROUP;

    private Long REPEAT_COUNT;

    private Long REPEAT_INTERVAL;

    private Long TIMES_TRIGGERED;


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

    public Long getREPEAT_COUNT() {
        return REPEAT_COUNT;
    }

    public void setREPEAT_COUNT(Long REPEAT_COUNT) {
        this.REPEAT_COUNT = REPEAT_COUNT;
    }

    public Long getREPEAT_INTERVAL() {
        return REPEAT_INTERVAL;
    }

    public void setREPEAT_INTERVAL(Long REPEAT_INTERVAL) {
        this.REPEAT_INTERVAL = REPEAT_INTERVAL;
    }

    public Long getTIMES_TRIGGERED() {
        return TIMES_TRIGGERED;
    }

    public void setTIMES_TRIGGERED(Long TIMES_TRIGGERED) {
        this.TIMES_TRIGGERED = TIMES_TRIGGERED;
    }

    @Override
    public String toString() {
        return "Qrtz_simple_triggers{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", TRIGGER_NAME=" + TRIGGER_NAME +
        ", TRIGGER_GROUP=" + TRIGGER_GROUP +
        ", REPEAT_COUNT=" + REPEAT_COUNT +
        ", REPEAT_INTERVAL=" + REPEAT_INTERVAL +
        ", TIMES_TRIGGERED=" + TIMES_TRIGGERED +
        "}";
    }
}
