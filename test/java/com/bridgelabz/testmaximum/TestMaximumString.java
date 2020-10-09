package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumString {
	@Test
	public void testFirstMaxString() {
		String max = TestMaximum.testMaximum("Peach", "Apple", "Banana");
		boolean firstString;
		if (max.equals("Peach")) {
			firstString = true;
		} else {
			firstString = false;
		}
		Assert.assertEquals(true, firstString);
	}

	@Test
	public void testSecondMaxString() {
		String max = TestMaximum.testMaximum("Apple", "Peach", "Banana");
		boolean secongString;
		if (max.equals("Peach")) {
			secongString = true;
		} else {
			secongString = false;
		}
		Assert.assertEquals(true, secongString);
	}

	@Test
	public void testThirdMaxString() {
		String max = TestMaximum.testMaximum("Apple", "Banana", "Peach");
		boolean thirdString;
		if (max.equals("Peach")) {
			thirdString = true;
		} else {
			thirdString = false;
		}
		Assert.assertEquals(true, thirdString);
	}
}
