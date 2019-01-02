package com.jaehyun.money;

public abstract class Money {
	protected int amount;
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return this.amount == money.amount
				&& getClass().equals(money.getClass());
	}
	
	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Franch franch(int amount) {
		return new Franch(amount);
	}
	
	abstract public Money times(int multiplier);
}
