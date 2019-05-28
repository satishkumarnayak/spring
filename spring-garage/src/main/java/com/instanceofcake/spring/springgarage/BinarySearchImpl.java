package com.instanceofcake.spring.springgarage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	SortAlgo sort;

	@Autowired
	public BinarySearchImpl(SortAlgo sort) {
		super();
		this.sort = sort;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		System.out.println("BinarySearchImpl binarySearch called");
		sort.sort(numbers);
		// QuickSortAlgo qsort = new QuickSortAlgo();
		// BubbleSortAlgo bsort = new BubbleSortAlgo();
		// sort the numbers using sort algo
		// apply binary search and return the result
		return 3;
	}

	@Autowired
	public void setSort(SortAlgo sort) {
		this.sort = sort;
	}
}
