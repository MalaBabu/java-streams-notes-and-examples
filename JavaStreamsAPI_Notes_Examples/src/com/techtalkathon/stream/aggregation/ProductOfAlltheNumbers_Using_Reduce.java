package com.techtalkathon.stream.aggregation;

import java.util.Arrays;
import java.util.List;

public class ProductOfAlltheNumbers_Using_Reduce {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer reduceResult = numbers.stream().reduce(1, (i, j) -> i * j);
		System.out.println(reduceResult);

	}
}
