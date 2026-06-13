package com.techtalkathon.stream.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SortedExampleFirstNumberGreaterthan10 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 11, 12, 7, 38, 9, 10);
		Optional<Integer> first = numbers
				.stream()
				.sorted()
				.filter(n -> n > 10)
				.findFirst();
		System.out.println(first.get());
	}
}
