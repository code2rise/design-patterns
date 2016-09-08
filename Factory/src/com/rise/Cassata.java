package com.rise;

public class Cassata extends IceCreamCreator {

	public Cassata() {
		setIceCreamType("Cassata");
	}
	
	@Override
	protected void prepareIceCream() {
		System.out.println("Prepared a delicious cassata for entire family!");
	}

	@Override
	protected void garnishIceCream() {
		System.out.println("Garnished it with multiple ice cream flavors!");
	}
}
