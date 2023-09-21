package top.codingmore.controller;

import cn.hutool.core.date.DateUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.codingmore.component.PublishPostJob;
import top.codingmore.dto.JobDTO;
import top.codingmore.service.IScheduleService;
import top.codingmore.webapi.ResultObject;

/**
 * @author silenceFire
 * @since 2023-06-18
 */
@Controller
@RequestMapping("/quartz")
@Tag(name = "quartz专用controller")
public class QuartzController {
    @Autowired
    IScheduleService scheduleService;

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    @ResponseBody
    @Operation(summary ="controller方法描述，新增调度任务")
    @Parameters({
            @Parameter(name = "jobDTO",description="controller方法参数描述，任务执行信息",required = true,in= ParameterIn.QUERY)
    })
    public ResultObject<String> addTask(@RequestBody JobDTO jobDTO) throws SchedulerException {
        if(jobDTO.getDate()==null || StringUtils.isBlank(jobDTO.getDataStr())){
            return ResultObject.failed("参数为空");
        }
        String res = scheduleService
                .scheduleFixTimeJob(
                        PublishPostJob.class,
                        DateUtil.parse(jobDTO.getDate(),"yyyy-MM-dd hh:mm:ss"),
                        jobDTO.getDataStr());
        return ResultObject.success(res);
    }
}
