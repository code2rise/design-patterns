package com.rise;

public class Sauce extends PizzaDecorator {

	public Sauce(IPizza pizza) {
		super(pizza);
		System.out.println("Sauce");
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Tomato Sauce";
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.3;
	}
}
