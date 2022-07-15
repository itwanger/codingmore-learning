package top.codingmore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.codingmore.webapi.ResultObject;

@RestController
@Api(tags = "整合 RabbitMQ")
@RequestMapping("/rabbitmq")
public class RabbitMQController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/sendSimple")
    @ApiOperation("简单模式")
    public ResultObject sendSimple(String routingKey, String message) {
        rabbitTemplate.convertAndSend(routingKey, message);
        return ResultObject.success("ok");
    }

    @PostMapping("/sendWork")
    @ApiOperation("工作队列模式")
    public ResultObject sendWork(String routingKey, String message) {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend(routingKey, "第" + i + "消息：" + message);
        }
        return ResultObject.success("ok");
    }

    @PostMapping("/sendBroadcast")
    @ApiOperation("广播模式")
    public ResultObject sendBroadcast(String exchange, String message) {
        rabbitTemplate.convertAndSend(exchange, "",message);
        return ResultObject.success("ok");
    }
}
