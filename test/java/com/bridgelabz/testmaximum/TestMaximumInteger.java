package com.bridgelabz.testmaximum;

import org.junit.Test;

import org.junit.Assert;

public class TestMaximumInteger {
	@Test
	public void testFirstMaxInteger() {
		Integer max = TestMaximum.testMaximum(30, 10, 20);
		boolean firstInteger;
		if (max.equals(30)) {
			firstInteger = true;
		} else {
			firstInteger = false;
		}
		Assert.assertEquals(true, firstInteger);
	}

	@Test
	public void testSecondMaxInteger() {
		Integer max = TestMaximum.testMaximum(20, 30, 10);
		boolean secondInteger;
		if (max.equals(30)) {
			secondInteger = true;
		} else {
			secondInteger = false;
		}
		Assert.assertEquals(true, secondInteger);
	}

	@Test
	public void testThirdMaxInteger() {
		Integer max = TestMaximum.testMaximum(20, 30, 40);
		boolean thirdInteger;
		if (max.equals(40)) {
			thirdInteger = true;
		} else {
			thirdInteger = false;
		}
		Assert.assertEquals(true, thirdInteger);
	}
}
