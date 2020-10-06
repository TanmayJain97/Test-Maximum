package com.test_maximum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestMaximumMain <T extends Comparable<T>> {
	
	//Generic Method
	public <T extends Comparable<T>> T findMaximum(Stream<T> gen_str) {

		T max = gen_str.sorted().reduce((less,more) -> more).get();
		printMaximum(max);
		return max;
	}

	public <T extends Comparable<T>> void printMaximum(T max) {
		System.out.println("Maximum value = "+max);
	}

	public void getInput() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter no of objects to input: ");
		int run_loop=sc.nextInt();
		
		for (int i=0;i<run_loop;i++) {
			System.out.print("Input "+(i+1)+": ");
	    	T input = (T) sc.next();
	    	push(input);
		}
    	sc.close();
	}
	
	public void push(T... input) {

    	Stream<T> gen_stream=Arrays.stream(input);
    	findMaximum(gen_stream);
	}

public static void main( String[] args ) {
		
		TestMaximumMain buildObj = new TestMaximumMain();
    	buildObj.getInput();
    }
}
