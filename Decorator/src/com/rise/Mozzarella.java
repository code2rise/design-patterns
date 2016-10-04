package com.rise;

public class Mozzarella extends PizzaDecorator {

	public Mozzarella(IPizza pizza) {
		super(pizza);
		System.out.println("Mozzarella");
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Mozzarella";
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}
}
