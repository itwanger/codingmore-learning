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
@ApiModel(value="Qrtz_calendars对象", description="")
public class Qrtz_calendars implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String CALENDAR_NAME;

    private Blob CALENDAR;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getCALENDAR_NAME() {
        return CALENDAR_NAME;
    }

    public void setCALENDAR_NAME(String CALENDAR_NAME) {
        this.CALENDAR_NAME = CALENDAR_NAME;
    }

    public Blob getCALENDAR() {
        return CALENDAR;
    }

    public void setCALENDAR(Blob CALENDAR) {
        this.CALENDAR = CALENDAR;
    }

    @Override
    public String toString() {
        return "Qrtz_calendars{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", CALENDAR_NAME=" + CALENDAR_NAME +
        ", CALENDAR=" + CALENDAR +
        "}";
    }
}
