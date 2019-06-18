package com.instanceofcake.spring.springgarage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.instanceofcake.spring.springgarage.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringGarageApplicationAnnotationConfig {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringGarageApplicationAnnotationConfig.class)) {

			BinarySearchImpl bsearch = context.getBean(BinarySearchImpl.class);
			System.out.println(bsearch);
		}

	}

}
