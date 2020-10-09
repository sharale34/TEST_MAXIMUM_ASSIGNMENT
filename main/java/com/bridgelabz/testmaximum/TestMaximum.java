package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		Integer x = 3, y = 4, z = 10;
		System.out.println("Welcome to the Test Maximum Program");
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximumInt(x, y, z));
	}

	public static Integer testMaximumInt(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}