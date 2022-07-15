package top.codingmore.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BroadcastConsumer {
    @RabbitListener(bindings = @QueueBinding(value = @Queue,
            exchange = @Exchange(name = "broadcast", type = "broadcast")))
    public void receiveOne(String message) {
        log.info("广播模式 receiveOne：{}", message);
    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue,
            exchange = @Exchange(name = "broadcast", type = "broadcast")))
    public void receiveTwo(String message) {
        log.info("广播模式 receiveTwo：{}", message);
    }
}
