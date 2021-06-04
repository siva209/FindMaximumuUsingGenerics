package com.bridgelabz;

public class FindMaximum {
	public static Integer findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	
	public static void main(String[] args) {
		System.out.println(findMax(10, 16, 8));
		

	}
}
	
