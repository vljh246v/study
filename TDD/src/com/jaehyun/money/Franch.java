package com.jaehyun.money;

public class Franch extends Money {
	
	public Franch(int amount) {
		this.amount = amount;
	}
	
	public Franch times(int multiplier) {
		return new Franch(amount * multiplier);
		
	}
}
