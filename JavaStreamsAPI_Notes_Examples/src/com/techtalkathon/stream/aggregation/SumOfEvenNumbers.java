package com.techtalkathon.stream.aggregation;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbers.stream()
				.filter(i -> i % 2 == 0)
				.mapToInt(i -> i)  // IntStream
				.sum();
		System.out.println(sum); //30
		
		Integer reduceRusult = numbers.stream()
				.filter(i -> i % 2 == 0)
				.reduce(0, (i, j) -> i + j);
		
		System.out.println(reduceRusult); //30
	}

}
