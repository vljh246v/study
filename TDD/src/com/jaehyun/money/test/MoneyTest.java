package com.jaehyun.money.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jaehyun.money.Dollar;

class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
		
		
	}
	
	@Test
	public void testEquailty() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
