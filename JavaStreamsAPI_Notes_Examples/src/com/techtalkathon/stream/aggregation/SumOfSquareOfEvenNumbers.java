package com.techtalkathon.stream.aggregation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfSquareOfEvenNumbers {
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		.filter(i->i%2==0)
		.mapToInt(i->i*i)
		.sum();
		System.out.println(sum); //20
		
		//*********************************************************************//
		
		
	Integer reduceresult = 
		 numbers.stream()
		.filter(i->i%2==0)
		.map(i->i*i)
		.reduce(0,(i,j)->i+j);
		System.out.println(reduceresult); //20
		
		
		//**********************************************************************//
		

		Optional<Integer> reduce = numbers.stream()
				.filter(i -> i % 2 == 0)
				.map(i -> i * i)
				.reduce(Integer::sum);
		System.out.println(reduce.get()); // 20
		
		
	}

}
