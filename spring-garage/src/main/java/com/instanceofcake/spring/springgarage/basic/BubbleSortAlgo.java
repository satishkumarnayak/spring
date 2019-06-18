package com.instanceofcake.spring.springgarage.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo {

	public int[] sort(int[] unsortedNumbers) {
		System.out.println("BubbleSortAlgo called");
		// sort the numbers
		int[] sortedNumbers = { 0, 1, 2 };
		return sortedNumbers;
	}
}
