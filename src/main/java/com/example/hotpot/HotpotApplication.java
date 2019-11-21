package com.example.hotpot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@ComponentScan(value = {"com.example.hotpot.*"})
@MapperScan(basePackages = "com.example.hotpot.mapper")
@SpringBootApplication
public class HotpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotpotApplication.class, args);
	}

}
