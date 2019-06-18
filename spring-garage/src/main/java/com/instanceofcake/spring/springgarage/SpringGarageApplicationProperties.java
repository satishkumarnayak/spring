package com.instanceofcake.spring.springgarage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.instanceofcake.spring.springgarage.basic.BinarySearchImpl;
import com.instanceofcake.spring.springgarage.properties.SomeService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringGarageApplicationProperties {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringGarageApplicationProperties.class)) {

			SomeService bean = context.getBean(SomeService.class);
			System.out.println(bean.getUrl());
		}

	}

}
