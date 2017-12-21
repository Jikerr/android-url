package org.zhdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.zhdev")
public class AndroidUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndroidUrlApplication.class, args);
	}
}
