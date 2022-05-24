package com.kt.edu.secondproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@MapperScan(basePackages = "com.kt.edu.secondproject.repository")
public class SecondprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondprojectApplication.class, args);
	}

}

