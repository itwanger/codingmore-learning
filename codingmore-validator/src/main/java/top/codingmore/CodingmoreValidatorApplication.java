package top.codingmore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class CodingmoreValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingmoreValidatorApplication.class, args);
	}

}
