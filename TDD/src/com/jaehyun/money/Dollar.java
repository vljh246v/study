package com.jaehyun.money;

public class Dollar {
	
	private int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Dollar dollar = (Dollar)obj; 
		return this.amount == dollar.amount;
	}
}
