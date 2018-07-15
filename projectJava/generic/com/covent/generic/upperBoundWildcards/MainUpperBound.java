package com.covent.generic.upperBoundWildcards;

import java.util.Arrays;
import java.util.List;

/*
 * Upper bound of the Wildcards
 * List<? extends Number> 
 * - we can read number
 * - we cannot write in it
 * 
 * Integer extends Number
 * Double extends Number
 * 
 */
class SumGeneriUpperBoundWildcards{
	public static <T> void sum(List<? extends Number> lista) {
		double sum =0.0;
		
		for(Number num: lista) {
			sum +=num.doubleValue();
		}
		System.out.println("Sum= "+sum);
	}
}
public class MainUpperBound {//
	
	public static void main(String[] args) {
		
		SumGeneriUpperBoundWildcards.sum(Arrays.asList(1,2,3,4,5));
		
		SumGeneriUpperBoundWildcards.sum(Arrays.asList(1.9,2.5,3.3,4.7,5.2));
	}
		
		
}


