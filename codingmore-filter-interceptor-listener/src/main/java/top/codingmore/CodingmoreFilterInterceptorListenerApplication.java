package top.codingmore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class CodingmoreFilterInterceptorListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingmoreFilterInterceptorListenerApplication.class, args);
    }

}
