package com.rise;

public class BasePizza implements IPizza {

	public BasePizza() {
		System.out.println("BasePizza");
	}
	
	@Override
	public String getDescription() {
		
		return "Thin Crust";
	}

	@Override
	public double getCost() {
		
		return 2.0;
	}

}
