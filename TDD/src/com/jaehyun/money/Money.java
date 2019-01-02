package com.jaehyun.money;

public class Money {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.amount && currency().equals(money.currency());
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franch(int amount) {
		return new Money(amount, "CHF");
	}

	public String currency() {
		return currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
	
	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}
}
