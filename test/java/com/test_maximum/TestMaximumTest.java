package com.test_maximum;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {

	TestMaximumMain testObj;

	@Before
	public void init() {
		testObj=new TestMaximumMain();
	}

	// TC 1.1
	@Test
	public void maxNumberAtFirstPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 3, 2, 1 };
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}

	// TC 1.2
	@Test
	public void maxNumberAtSecondPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 1, 3, 2 };
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}

	// TC 1.3
	@Test
	public void maxNumberAtThirdPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 1, 2, 3 };
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}

}
