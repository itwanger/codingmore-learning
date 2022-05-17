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
@ApiModel(value="Qrtz_locks对象", description="")
public class Qrtz_locks implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String SCHED_NAME;

    private String LOCK_NAME;


    public String getSCHED_NAME() {
        return SCHED_NAME;
    }

    public void setSCHED_NAME(String SCHED_NAME) {
        this.SCHED_NAME = SCHED_NAME;
    }

    public String getLOCK_NAME() {
        return LOCK_NAME;
    }

    public void setLOCK_NAME(String LOCK_NAME) {
        this.LOCK_NAME = LOCK_NAME;
    }

    @Override
    public String toString() {
        return "Qrtz_locks{" +
        "SCHED_NAME=" + SCHED_NAME +
        ", LOCK_NAME=" + LOCK_NAME +
        "}";
    }
}
