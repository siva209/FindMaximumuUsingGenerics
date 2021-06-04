package com.bridgelabz;

public class FindMaximum {

	public static <E extends Comparable<E>> E findMax(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println(findMax(10, 18, 8));
		System.out.println(findMax(10.1f, 16.2f, 8.0f));
		System.out.println(findMax("Siva", "Ashok", "Ramu"));

	}

}
