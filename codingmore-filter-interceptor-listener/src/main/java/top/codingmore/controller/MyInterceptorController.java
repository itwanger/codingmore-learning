package top.codingmore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/13/22
 */
@RestController
@RequestMapping("/myinterceptor")
public class MyInterceptorController {
    @RequestMapping("/hello")
    public String hello() {
        return "沉默王二是傻X";
    }
}
