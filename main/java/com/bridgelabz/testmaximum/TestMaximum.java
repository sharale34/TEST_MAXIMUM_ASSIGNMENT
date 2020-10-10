package com.bridgelabz.testmaximum;

import java.util.Arrays;

public class TestMaximum<T extends Comparable<T>> {
	public static void main(String[] args) {
		System.out.println("Welcome to the test maximum program");
		TestMaximum.testMaximum(10, 56, 26, 102, 78);
		TestMaximum.testMaximum(8.5f, 4.5f, 5.5f);
		TestMaximum.testMaximum("Apple", "Peach", "Banana", "Custard");
	}

	public static <T extends Comparable<T>> T testMaximum(T... values) {
		Arrays.sort(values);
		T max = values[values.length - 1];
		System.out.printf("The maximum is: %s.\n", max);
		return max;
	}

}
