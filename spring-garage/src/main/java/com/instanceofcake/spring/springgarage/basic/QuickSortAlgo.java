package com.instanceofcake.spring.springgarage.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Primary
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

	public int[] sort(int[] unsortedNumbers) {
		System.out.println("QuickSortAlgo called");
		// sort the numbers
		int[] sortedNumbers = { 0, 1, 2 };
		return sortedNumbers;
	}
}
