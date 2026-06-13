package com.techtalkathon.stream.aggregation;

import java.util.Arrays;
import java.util.List;

public class CountExampleNumbersGreaterThanFive {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		long count =numbers.stream()
				.filter(i -> i > 5)
				.count();
		System.out.println(count);

	}
}
