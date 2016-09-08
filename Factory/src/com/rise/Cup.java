package com.rise;

public class Cup extends IceCreamCreator {

	public Cup() {
		setIceCreamType("Cup");
	}
	
	@Override
	protected void prepareIceCream() {
		System.out.println("Prepared a delicious cup of ice cream!");
	}

	@Override
	protected void garnishIceCream() {
		System.out.println("Garnished it with chocolate syrup!");
	}

}
