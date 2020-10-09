package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximum(10, 56, 26));
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximum(8.5f, 4.5f, 5.5f));
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximum("Apple", "Peach", "Banana"));
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}