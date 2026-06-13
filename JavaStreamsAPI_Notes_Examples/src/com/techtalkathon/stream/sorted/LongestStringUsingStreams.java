package com.techtalkathon.stream.sorted;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringUsingStreams {
	public static void main(String[] args) {
		
		List<String> names = List.of("Microservice", "Java", "SpringBoot", "mongoDb", "techtalkathon");
		Optional<String> longestString = names.stream().sorted(Comparator.comparing(String::length).reversed())
				.findFirst();

		System.out.println(longestString.get()); // techtalkathon

		//******************************************************************//

		Optional<String> longestString1 = names.stream().max(Comparator.comparing(String::length));

		System.out.println(longestString1.get()); //techtalkathon

		//******************************************************************//

		String reduceString = names.stream().reduce((s1, s2) -> {
			if (s1.length() > s2.length()) {
				return s1;
			} else {
				return s2;
			}
		}).get();
		
		System.out.println(reduceString); // techtalkathon

		//******************************************************************//
		String reduceString2 = 
				names.stream()
				.reduce((s1, s2) -> (s1.length() > s2.length()) ? s1 : s2)
				.get();

		System.out.println(reduceString2); // techtalkathon

		// Note : Sort + findFirst ==> min with comparator
		// Note : Sort + findLast (reversed) ==> max with comparator
	}
}
