package top.codingmore.config;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public RabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        // AUTO 消费完后自动确认（Spring 确认）
        // NONE 消息分配完就确认（RabbitMQ 确认）
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        // 拒绝策略 true 时回到队列 false 时丢弃 默认为 true
        factory.setDefaultRequeueRejected(true);
        // 默认是 250
        factory.setPrefetchCount(0);
        return factory;
    }
}
