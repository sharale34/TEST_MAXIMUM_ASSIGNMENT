package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumFloat {
	@Test
	public void testFirstMaxFloat() {
		boolean firstFloat;
		if ((TestMaximum.testMaximum(30.5f, 10.25f, 20.65f)).equals(30.5f)) {
			firstFloat = true;
		} else {
			firstFloat = false;
		}
		Assert.assertEquals(true, firstFloat);
	}

	@Test
	public void testSecondMaxFloat() {
		boolean secondFloat;
		if ((TestMaximum.testMaximum(10.25f, 30.5f, 20.65f)).equals(30.5f)) {
			secondFloat = true;
		} else {
			secondFloat = false;
		}
		Assert.assertEquals(true, secondFloat);
	}
	
	@Test
	public void testThirdMaxFloat() {
		boolean thirdFloat;
		if ((TestMaximum.testMaximum(10.25f, 30.5f, 40.65f)).equals(40.65f)) {
			thirdFloat = true;
		} else {
			thirdFloat = false;
		}
		Assert.assertEquals(true, thirdFloat);
	}
}
