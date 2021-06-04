package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.FindMaximum;

public class FindMaximumTest {
	@Test
	public void givenMaximumValueAtFirst_ShouldReturnFirstIntegerMax() {
		Assert.assertSame(10, new FindMaximum(10, 7, 5).findMax());
	}

	@Test
	public void givenMaximumValueAtSecondPosition_ShouldReturnSecondIntegerMax() {
		Assert.assertSame(10, new FindMaximum(1, 10, 5).findMax());
	}

	@Test
	public void givenMaximumValueAtThirdPosition_ShouldReturnThirdIntegerMax() {
		Assert.assertSame(10, new FindMaximum(1, 4, 10).findMax());
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnFirstFloatMax() {
		Assert.assertEquals(10.4f, new FindMaximum(10.4f, 7.2f, 5.5f).findMax());
	}

	@Test
	public void givenMaximumValueAtSecondPosition_ShouldReturnSecondFloatMax() {
		Assert.assertEquals(10.4f, new FindMaximum(7.2f, 10.4f, 5.5f).findMax());
	}

	@Test
	public void givenMaximumValueAtThirdPosition_ShouldReturnThirdFloatMax() {
		Assert.assertEquals(10.4f, new FindMaximum(7.2f, 5.5f, 10.4f).findMax());
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnFirstStringMax() {
		Assert.assertEquals("Siva", new FindMaximum("Siva", "Ashok", "Ramu").findMax());
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnSecondStringMax() {
		Assert.assertEquals("Siva", new FindMaximum("Ashok", "Siva", "Ramu").findMax());
	}

	@Test
	public void givenMaximumValueAtFirstPosition_ShouldReturnThirdStringMax() {
		Assert.assertEquals("Siva", new FindMaximum("Ramu", "Ashok", "Siva").findMax());
	}

}
