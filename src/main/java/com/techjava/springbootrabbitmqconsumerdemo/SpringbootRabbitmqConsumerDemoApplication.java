package com.techjava.springbootrabbitmqconsumerdemo;

import com.techjava.springbootrabbitmqconsumerdemo.consumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqConsumerDemoApplication.class, args);
	}

}
