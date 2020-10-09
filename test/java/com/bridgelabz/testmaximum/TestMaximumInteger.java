package com.bridgelabz.testmaximum;

import org.junit.Test;

import org.junit.Assert;

public class TestMaximumInteger {
	@Test
	public void testFirstMaxInteger() {
		boolean firstInteger;
		if ((TestMaximum.testMaximum(30, 10, 20)).equals(30)) {
			firstInteger = true;
		} else {
			firstInteger = false;
		}
		Assert.assertEquals(true, firstInteger);
	}

	@Test
	public void testSecondMaxInteger() {
		boolean secondInteger;
		if ((TestMaximum.testMaximum(20, 30, 10)).equals(30)) {
			secondInteger = true;
		} else {
			secondInteger = false;
		}
		Assert.assertEquals(true, secondInteger);
	}

	@Test
	public void testThirdMaxInteger() {
		boolean thirdInteger;
		if ((TestMaximum.testMaximum(20, 30, 40)).equals(40)) {
			thirdInteger = true;
		} else {
			thirdInteger = false;
		}
		Assert.assertEquals(true, thirdInteger);
	}
}
