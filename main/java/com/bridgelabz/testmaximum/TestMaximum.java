package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		Integer x = 3, y = 4, z = 10;
		Float x1 = 10.55f, y1 = 29.22f, z1 = 23.2f;
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximumInt(x, y, z));
		System.out.println("Maximum of three integers given is : " + TestMaximum.testMaximumFloat(x1, y1, z1));
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

	public static Float testMaximumFloat(Float x1, Float y1, Float z1) {
		Float max = x1;
		if (y1.compareTo(max) > 0) {
			max = y1;
		}
		if (z1.compareTo(max) > 0) {
			max = z1;
		}
		return max;
	}
}