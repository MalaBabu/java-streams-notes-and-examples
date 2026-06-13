package com.techtalkathon.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 17, 8, 9, 10);
		int asInt = numbers.stream()
				.mapToInt(i->i)
				.max()
				.getAsInt();
		System.out.println(asInt);
		
		int reduseInt = numbers.stream()
				.reduce(0, (i,j)->Integer.max(i,j));
		
		System.out.println(reduseInt);
		
		int reduseInt1 = numbers.stream()
				.reduce(0, Integer::max);
		
		System.out.println(reduseInt1);

		int reduseInt2 = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.findFirst().get();
		
		System.out.println(reduseInt2);	
	
	}

}
