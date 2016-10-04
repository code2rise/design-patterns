package com.rise;

public abstract class PizzaDecorator implements IPizza {
	
	protected IPizza newPizza;
	
	public PizzaDecorator(IPizza pizza) {
		newPizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return newPizza.getDescription();
	}
	
	@Override
	public double getCost() {
		return newPizza.getCost();
	}
	
}
