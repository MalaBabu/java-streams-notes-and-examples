package com.techtalkathon.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExamplesEvenNumbers {

	// 1. Filter Even Numbers from the List
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumberList = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> evenNumberList1 = numbers.stream().filter(i -> i % 2 == 0).toList();  // toList = collect(Collectors.toList())
		
		System.out.println(evenNumberList); // [2, 4, 6, 8, 10]
		
		System.out.println(evenNumberList1); // [2, 4, 6, 8, 10]

	}

}
