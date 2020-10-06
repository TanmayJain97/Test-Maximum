package com.test_maximum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMaximumMain {
	
	//Generic Method
	public <T extends Comparable<T>> T findMaximum(Stream<T> gen_str) {

		return gen_str.collect(Collectors.maxBy(T::compareTo)).get();
	}


public static void main( String[] args ) {
		
	TestMaximumMain buildObj = new TestMaximumMain();
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Input 3 integers: ");
    	System.out.print("Int 1: ");
    	int num1 = sc.nextInt();
    	System.out.print("Int 2: ");
    	int num2 = sc.nextInt();
    	System.out.print("Int 3: ");
    	int num3 = sc.nextInt();
    	
    	System.out.println("Input 3 strings: ");
    	System.out.print("String 1: ");
    	String str1 = sc.next();
    	System.out.print("String 2: ");
    	String str2 = sc.next();
    	System.out.print("String 3: ");
    	String str3 = sc.next();
    	
    	Integer num_arr[] = new Integer[]{num1,num2,num3};
    	Float fl_arr[] = new Float[] {(float) num1,(float) num2,(float) num3};
    	String str_arr[] = new String[]{str1,str2,str3};
    	
    	Stream<Integer> num_stream=Arrays.stream(num_arr);
    	Stream<Float> fl_stream=Arrays.stream(fl_arr);
    	Stream<String> str_stream=Arrays.stream(str_arr);
    	
    	System.out.println("Maximum integer = "+buildObj.findMaximum(num_stream));
    	System.out.println("Maximum float = "+buildObj.findMaximum(fl_stream));
    	System.out.println("Maximum string = "+buildObj.findMaximum(str_stream));
    	sc.close();
    }
}
