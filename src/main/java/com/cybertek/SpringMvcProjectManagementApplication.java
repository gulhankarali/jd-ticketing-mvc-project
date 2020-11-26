package com.cybertek;

import com.cybertek.bootstrap.DataGenerator;
import com.cybertek.implementation.RoleServiceImpl;
import com.cybertek.implementation.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@SpringBootApplication
public class SpringMvcProjectManagementApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(SpringMvcProjectManagementApplication.class, args);

	}
}
