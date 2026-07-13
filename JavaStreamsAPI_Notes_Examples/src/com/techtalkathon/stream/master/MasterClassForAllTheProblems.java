package com.techtalkathon.stream.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MasterClassForAllTheProblems {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
		List<Integer> list = numbers.stream()
		.sorted()
		.toList();
		System.out.println(list);
		// OR
		
		List<Integer> list1 = numbers.stream()
		        .mapToInt(i -> i)
		        .sorted()
		        .collect(
		            ArrayList::new,
		            List::add,
		            List::addAll
		        );		
		
		System.out.println(list1);
		
		// Check first non repeating charecter using Streams
		
		
		String s="BABU";
		
		Stream<char[]> of = Stream.of(s.toCharArray());
		
	}
}
