package com.test_maximum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMaximumMain <T extends Comparable<T>> {
	
	//Generic Method
	public <T extends Comparable<T>> T findMaximum(Stream<T> gen_str) {

		return gen_str.collect(Collectors.maxBy(T::compareTo)).get();
	}

	public void getInput() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter 3 objects: ");
    	System.out.print("Input 1: ");
    	T input1 = (T) sc.next();
    	System.out.print("Input 2: ");
    	T input2 = (T) sc.next();
    	System.out.print("Input 3: ");
    	T input3 = (T) sc.next();
    	
    	@SuppressWarnings("unchecked")
		T[] gen_arr = (T[])new Object[3];
    	gen_arr[0]=input1;
    	gen_arr[1]=input2;
    	gen_arr[2]=input3;
    	
    	Stream<T> gen_stream=Arrays.stream(gen_arr);
    	
    	System.out.println("Maximum = "+findMaximum(gen_stream));
    	sc.close();
	}

public static void main( String[] args ) {
		
		TestMaximumMain buildObj = new TestMaximumMain();
    	buildObj.getInput();
    }
}
