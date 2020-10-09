package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumString {
	@Test
	public void testFirstMaxString() {
		boolean firstString;
		if ((TestMaximum.testMaximum("Peach", "Apple", "Banana")).equals("Peach")) {
			firstString = true;
		} else {
			firstString = false;
		}
		Assert.assertEquals(true, firstString);
	}

	@Test
	public void testSecondMaxString() {
		boolean secongString;
		if ((TestMaximum.testMaximum("Apple", "Peach", "Banana")).equals("Peach")) {
			secongString = true;
		} else {
			secongString = false;
		}
		Assert.assertEquals(true, secongString);
	}

	@Test
	public void testThirdMaxString() {
		boolean thirdString;
		if ((TestMaximum.testMaximum("Apple", "Banana", "Peach")).equals("Peach")) {
			thirdString = true;
		} else {
			thirdString = false;
		}
		Assert.assertEquals(true, thirdString);
	}
}
