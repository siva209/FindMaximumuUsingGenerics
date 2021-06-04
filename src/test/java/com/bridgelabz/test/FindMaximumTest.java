package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.FindMaximum;

public class FindMaximumTest {
	FindMaximum findMaximum = new FindMaximum();

	@Test
	public void givenMaximumValueAtFirst_ShouldReturnFirstIntegerMax() {
		Integer MaximumNumber = findMaximum.findMax(10, 7, 5);
		Assert.assertSame(10, MaximumNumber);
	}

	@Test
	public void givenMaximumValueAtSecondPosition_ShouldReturnSecondIntegerMax() {
		Integer MaximumNumber = findMaximum.findMax(10, 15, 1);
		Assert.assertSame(15, MaximumNumber);
	}

	@Test
	public void givenMaximumValueAtThirdPosition_ShouldReturnThirdIntegerMax() {
		Integer MaximumNumber = findMaximum.findMax(10, 20, 55);
		Assert.assertSame(55, MaximumNumber);
	}

	
}
