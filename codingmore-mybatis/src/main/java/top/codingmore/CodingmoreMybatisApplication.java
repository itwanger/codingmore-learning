package top.codingmore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class CodingmoreMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingmoreMybatisApplication.class, args);
	}

}
