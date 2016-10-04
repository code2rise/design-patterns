package com.rise;

public class PizzaMaker {

	public static void main(String[] args) {
		PizzaDecorator pizza = new Sauce(new Mozzarella(new BasePizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
