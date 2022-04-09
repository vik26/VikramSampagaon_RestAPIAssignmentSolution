package com.employee.management;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.employee.management")
public class Application {
static final Logger logger  = LogManager.getLogger(Application.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
logger.info("entered application");
		SpringApplication.run(Application.class, args);
	}

}