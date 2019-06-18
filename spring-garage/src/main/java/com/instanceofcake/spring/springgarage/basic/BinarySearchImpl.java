package com.instanceofcake.spring.springgarage.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

//@Scope("prototype")

@Component
//@Controller
//@Repository
//@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	org.slf4j.Logger log =  LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	@Qualifier("quick") 
	SortAlgo sortAlgo;

	/*
	 * @Autowired public BinarySearchImpl(SortAlgo sort) { super(); // this.sort =
	 * sort; this.bubbleSortAlgo = sort; }
	 */

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		System.out.println("BinarySearchImpl binarySearch called");
	//	sort.sort(numbers);
		sortAlgo.sort(numbers);
		// QuickSortAlgo qsort = new QuickSortAlgo();
		// BubbleSortAlgo bsort = new BubbleSortAlgo();
		// sort the numbers using sort algo
		// apply binary search and return the result
		return 3;
	}

	@PostConstruct
	public void postConstruct() {

		log.info("in -----postConstruct ----");
	}
	
	@PreDestroy
	public void preDestroy() {
		log.info("in -----preDestroy1 ----");
	}
}
