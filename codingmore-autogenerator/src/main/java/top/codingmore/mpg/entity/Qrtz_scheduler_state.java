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
@ApiModel(value="Qrtz_scheduler_state对象", description="")
public class Qrtz_scheduler_state implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String INSTANCE_NAME;

    private Long LAST_CHECKIN_TIME;

    private Long CHECKIN_INTERVAL;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getINSTANCE_NAME() {
        return INSTANCE_NAME;
    }

    public void setINSTANCE_NAME(String INSTANCE_NAME) {
        this.INSTANCE_NAME = INSTANCE_NAME;
    }

    public Long getLAST_CHECKIN_TIME() {
        return LAST_CHECKIN_TIME;
    }

    public void setLAST_CHECKIN_TIME(Long LAST_CHECKIN_TIME) {
        this.LAST_CHECKIN_TIME = LAST_CHECKIN_TIME;
    }

    public Long getCHECKIN_INTERVAL() {
        return CHECKIN_INTERVAL;
    }

    public void setCHECKIN_INTERVAL(Long CHECKIN_INTERVAL) {
        this.CHECKIN_INTERVAL = CHECKIN_INTERVAL;
    }

    @Override
    public String toString() {
        return "Qrtz_scheduler_state{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", INSTANCE_NAME=" + INSTANCE_NAME +
        ", LAST_CHECKIN_TIME=" + LAST_CHECKIN_TIME +
        ", CHECKIN_INTERVAL=" + CHECKIN_INTERVAL +
        "}";
    }
}
