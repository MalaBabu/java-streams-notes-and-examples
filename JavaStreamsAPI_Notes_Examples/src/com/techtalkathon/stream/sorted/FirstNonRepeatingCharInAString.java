package com.techtalkathon.stream.sorted;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInAString {

	public static void main(String[] args) {

		String s = "BABU";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {

			if (map.get(charArray[i]) == null) {
				map.put(charArray[i], 1);

			} else {
				map.put(charArray[i], map.get(charArray[i]) + 1);

			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

		char c = map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();

		System.out.println(c);

		String str = "aabbcdeff";

		Character result = str.chars() // IntStream
				.mapToObj(charEle -> (char) charEle) // Stream<Character>
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, // Preserve order
						Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst()
				.orElse(null);

		System.out.println(result);

		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6);

		Set<Integer> set = new HashSet<Integer>();

		Integer nonRepeatingInt = numbers.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, // Preserve
																												// order
				Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey).findFirst().orElse(null);
		;
		System.out.println(nonRepeatingInt);

		List<List<String>> stringLists = Arrays.asList(
				Arrays.asList("Madhu", "Babu", "Kusal"), 
				Arrays.asList("Madhu", "Babu"),
				Arrays.asList("Madhu", "Babu", "varun", "vasu"));
		
		long count = stringLists.stream().flatMap(List::stream).count();
		System.out.println(count);
		
		
        String sentence = "Java Streams are Awesome";
        
        List<String> wordList= Arrays.asList(sentence.split(" "));

        String reversedString = wordList.stream()
        .map(word->new StringBuilder(word).reverse().toString())
        .collect(Collectors.joining(" "));
        
        System.out.println(reversedString);

		Character orElse = str.chars().mapToObj(cr -> (char) cr)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.orElse(null);

		System.out.println(orElse);
        

	}
}
