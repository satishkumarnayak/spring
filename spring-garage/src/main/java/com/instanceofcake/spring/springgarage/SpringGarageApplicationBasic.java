/*
 * package com.instanceofcake.spring.springgarage;
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.ConfigurableApplicationContext; import
 * org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.instanceofcake.spring.springgarage.basic.BinarySearchImpl; import
 * com.instanceofcake.spring.springgarage.scope.JDBCConnection; import
 * com.instanceofcake.spring.springgarage.scope.PersonDAO;
 * 
 * @SpringBootApplication
 * 
 * public class SpringGarageApplicationBasic {
 * 
 * public static void main(String[] args) {
 * 
 * // QuickSortAlgo bsort = new QuickSortAlgo(); // BubbleSortAlgo bsort = new
 * BubbleSortAlgo(); // BinarySearchImpl bsearch = new BinarySearchImpl(bsort);
 * 
 * ApplicationContext context =
 * SpringApplication.run(SpringGarageApplicationBasic.class, args);
 * 
 * 
 * 
 * 
 * BinarySearchImpl bsearch = context.getBean(BinarySearchImpl.class);
 * System.out.println(bsearch);
 * 
 * 
 * BinarySearchImpl bsearch2 = context.getBean(BinarySearchImpl.class);
 * System.out.println(bsearch.hashCode());
 * System.out.println(bsearch2.hashCode()); int[] numbers = { 0, 5, 5, 1, 2 };
 * bsearch.binarySearch(numbers, 1);
 * 
 * }
 * 
 * }
 */