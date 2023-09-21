package top.codingmore.component;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import top.codingmore.service.IScheduleService;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/21/22
 */
@Slf4j
@Component
public class PublishPostJob extends QuartzJobBean {
    @Autowired
    private IScheduleService scheduleService;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext){
        Trigger trigger = jobExecutionContext.getTrigger();
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        //获取任务中的数据
        Long data = jobDataMap.getLong("data");
        log.info("定时操作，使用参数：{}",data);

        // 获取文章的 ID后获取文章，更新文章为发布的状态，还有发布的时间。操作成功后进行下面操作；
        boolean success = true;

        //完成后删除触发器和任务
        if (success) {
            log.info("定时任务执行成功，开始清除定时任务");
            try {
                scheduleService.cancelScheduleJob(trigger.getKey().getName());
            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        }
    }
}