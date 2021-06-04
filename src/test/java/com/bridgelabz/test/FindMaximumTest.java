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
	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnFirstFloatMax() {
		Float MaximumNumber = FindMaximum.findMax(15.1f, 2.5f, 5.0f);
		Assert.assertEquals(15.1f, MaximumNumber, 0.001);
	}

	@Test
	public void givenMaximumValueAtSecondPosition_ShouldReturnSecondFloatMax() {
		Float MaximumNumber = FindMaximum.findMax(15.1f, 20.5f, 5.0f);
		Assert.assertEquals(20.5f, MaximumNumber, 0.001);
	}

	@Test
	public void givenMaximumValueAtThirdPosition_ShouldReturnThirdFloatMax() {
		Float MaximumNumber = FindMaximum.findMax(15.1f, 2.5f, 25.2f);
		Assert.assertEquals(25.2f, MaximumNumber, 0.001);
	}
	
	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnFirstStringMax() {
		String MaximumString = FindMaximum.findMax("Siva", "Ashok", "Ramu");
		Assert.assertEquals("Siva", MaximumString);
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnSecondStringMax() {
		String MaximumString = FindMaximum.findMax("Ashok", "Siva", "Ramu");
		Assert.assertEquals("Siva", MaximumString);
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnThirdStringMax() {
		String MaximumString = FindMaximum.findMax("Ramu", "Ashok", "Siva");
		Assert.assertEquals("Siva", MaximumString);
	}
	
}
