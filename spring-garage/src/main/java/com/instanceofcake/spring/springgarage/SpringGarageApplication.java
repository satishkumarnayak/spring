package com.instanceofcake.spring.springgarage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringGarageApplication {

	public static void main(String[] args) {

		// QuickSortAlgo bsort = new QuickSortAlgo();
//		BubbleSortAlgo bsort = new BubbleSortAlgo();
		// BinarySearchImpl bsearch = new BinarySearchImpl(bsort);

		ApplicationContext context = SpringApplication.run(SpringGarageApplication.class, args);
		BinarySearchImpl bsearch = context.getBean(BinarySearchImpl.class);

		int[] numbers = { 0, 5, 5, 1, 2 };
		bsearch.binarySearch(numbers, 1);
	}

}
