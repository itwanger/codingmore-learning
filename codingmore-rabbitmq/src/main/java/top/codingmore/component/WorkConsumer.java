package top.codingmore.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WorkConsumer {
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receiveOne(String message) {
        log.info("工作队列模式 receiveOne：{}", message);
    }

    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receiveTwo(String message) {
        log.info("工作队列模式 receiveTwo：{}", message);
    }
}
