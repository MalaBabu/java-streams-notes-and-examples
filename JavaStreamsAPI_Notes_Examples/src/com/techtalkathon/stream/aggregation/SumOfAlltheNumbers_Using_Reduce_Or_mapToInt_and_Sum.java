package com.techtalkathon.stream.aggregation;

import java.util.Arrays;
import java.util.List;

public class SumOfAlltheNumbers_Using_Reduce_Or_mapToInt_and_Sum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(i -> i).sum();
		Integer reduceSum = numbers.stream().reduce(0,(i,j)->i+j);
		System.out.println(sum); // 15
		System.out.println(reduceSum); // 15
	}
}
