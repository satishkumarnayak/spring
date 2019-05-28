package com.instanceofcake.spring.springgarage;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgo {

	public int[] sort(int[] unsortedNumbers) {
		System.out.println("BubbleSortAlgo called");
		// sort the numbers
		int[] sortedNumbers = { 0, 1, 2 };
		return sortedNumbers;
	}
}
