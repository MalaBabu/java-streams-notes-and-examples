package com.techtalkathon.stream.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExampleFirstNumberGreaterthan10InList {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 15, 16, 7, 38, 9, 10);
		Optional<Integer> first = numbers
				.stream()
				.filter(n -> n > 10)
				.findFirst();
		System.out.println(first.get());
	}
}
