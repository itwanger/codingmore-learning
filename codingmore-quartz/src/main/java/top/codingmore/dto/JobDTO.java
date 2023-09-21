package top.codingmore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author silenceFire
 * @since 2023-06-18
 */
@Data
@Schema(name = "JobDTO", description = "任务参数工具类")
public class JobDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Schema(name = "DataStr", description = "任务执行传递的参数")
    private String DataStr;
    @Schema(name = "date", description = "任务执行的时间")
    private String date;
}
