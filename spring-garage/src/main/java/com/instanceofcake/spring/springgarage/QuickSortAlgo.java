package com.instanceofcake.spring.springgarage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgo {

	public int[] sort(int[] unsortedNumbers) {
		System.out.println("QuickSortAlgo called");
		// sort the numbers
		int[] sortedNumbers = { 0, 1, 2 };
		return sortedNumbers;
	}
}
