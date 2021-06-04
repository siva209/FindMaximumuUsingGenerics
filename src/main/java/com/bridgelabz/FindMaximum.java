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

	public static Float findMax(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static String findMax(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {

		System.out.println(findMax(10, 16, 8));
		System.out.println(findMax(10.1f, 16.2f, 8.0f));
		System.out.println(findMax("Ashok", "Ramu", "Siva"));

	}

}
