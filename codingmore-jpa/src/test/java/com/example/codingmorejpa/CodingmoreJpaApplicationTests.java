package com.example.codingmorejpa;

import com.example.codingmorejpa.entity.User;
import com.example.codingmorejpa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class CodingmoreJpaApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        // 查询所有
        userService.findAll().stream().forEach(user -> log.info("查询所有{}", user));

        // 新增数据
        userService.save(new User().setId(1).setAge(14).setName("沉默王三").setPassword("123456"));
        userService.save(new User().setId(3).setAge(12).setName("沉默王四").setPassword("123456"));
        userService.save(new User().setId(4).setAge(12).setName("沉默王五").setPassword("123456"));

        // 分页查询
        userService.findAll(PageRequest.of(1,2)).stream().forEach(user -> log.info("分页查询{}", user));
        // 模糊查询
        log.info("模糊查询{}",userService.findByNameLike("沉默"));
        // 模糊查询
        log.info("模糊查询原生 SQL{}",userService.findByNameLike("沉默"));
        // 模糊查询
        log.info("模糊查询@Param 传递参数{}",userService.findByNameLike("沉默"));
        // 删除
        userService.delete(1);
    }
}
