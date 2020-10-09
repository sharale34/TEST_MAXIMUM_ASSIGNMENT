package com.bridgelabz.testmaximum;

public class TestMaximum<T extends Comparable<T>> {
	T x, y, z;

	public TestMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T testMaximum() {
		return TestMaximum.testMaximum(x, y, z);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the test maximum program");
		TestMaximum.testMaximum(10, 56, 26);
		TestMaximum.testMaximum(8.5f, 4.5f, 5.5f);
		TestMaximum.testMaximum("Apple", "Peach", "Banana");
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("The maximum of %s, %s and %s is: %s.\n", x, y, z, max);
	}
}