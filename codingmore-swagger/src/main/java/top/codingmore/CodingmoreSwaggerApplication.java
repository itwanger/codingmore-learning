package top.codingmore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class CodingmoreSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingmoreSwaggerApplication.class, args);
    }

}
