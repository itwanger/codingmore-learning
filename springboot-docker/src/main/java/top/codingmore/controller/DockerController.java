package top.codingmore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/26/22
 */
@RequestMapping()
@RestController
public class DockerController {
    @RequestMapping("/")
    public String hello() {
        return "Docker，我告诉你，沉默王二是沙雕";
    }
}
