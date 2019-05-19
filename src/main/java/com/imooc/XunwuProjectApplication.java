package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.imooc")
public class XunwuProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(XunwuProjectApplication.class, args);
	}

}
