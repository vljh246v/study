package com.jaehyun.money.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jaehyun.money.Dollar;
import com.jaehyun.money.Franch;
import com.jaehyun.money.Money;

class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);

		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
 
	}
	@Test
	public void testEquailty() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franch(10).equals(Money.franch(10)));
		assertFalse(Money.franch(10).equals(Money.franch(12)));
		assertFalse(Money.dollar(10).equals(Money.franch(10)));
	}
	
	@Test
	public void testFranchEquailty() {
		assertTrue(Money.franch(5).equals(Money.franch(5)));
		assertFalse(Money.franch(5).equals(Money.franch(6)));
	}
	
	@Test
	public void testFranchMultiplication() {
		Money five = Money.franch(5);

		assertEquals(Money.franch(10), five.times(2));
		assertEquals(Money.franch(15), five.times(3));
 
	}
	
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franch(10, "CHF")));
	}
	
	@Test
	public void testSimpleAddition() {
		Money sum = Money.dollar(5).plus(Money.dollar(5));
		assertEquals(sum, Money.dollar(10));
	}
}
