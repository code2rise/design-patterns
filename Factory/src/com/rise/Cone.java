package com.rise;

public class Cone extends IceCreamCreator {

	public Cone() {
		setIceCreamType("Cone");
	}
	
	@Override
	protected void prepareIceCream() {
		System.out.println("Prepared a delicious cone!");
	}

	@Override
	protected void garnishIceCream() {
		System.out.println("Garnished it with dryfruits!");
	}

}
