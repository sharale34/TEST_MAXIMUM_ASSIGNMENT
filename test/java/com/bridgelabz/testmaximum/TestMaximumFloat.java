package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumFloat {
	@Test
	public void testFirstMaxInteger() {
		Float max = TestMaximum.testMaximum(30.5f, 10.25f, 20.65f);
		boolean firstFloat;
		if (max.equals(30.5f)) {
			firstFloat = true;
		} else {
			firstFloat = false;
		}
		Assert.assertEquals(true, firstFloat);
	}

	@Test
	public void testSecondMaxFloat() {
		Float max = TestMaximum.testMaximum(10.25f, 30.5f, 20.65f);
		boolean secondFloat;
		if (max.equals(30.5f)) {
			secondFloat = true;
		} else {
			secondFloat = false;
		}
		Assert.assertEquals(true, secondFloat);
	}
	
	@Test
	public void testThirdMaxFloat() {
		Float max = TestMaximum.testMaximum(10.25f, 30.5f, 40.65f);
		boolean thirdFloat;
		if (max.equals(40.65f)) {
			thirdFloat = true;
		} else {
			thirdFloat = false;
		}
		Assert.assertEquals(true, thirdFloat);
	}
}
