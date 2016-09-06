package com.rise.icecreamcenter;

public class Cup extends IceCreamBase {
	
	@Override
	public void prepareIceCream() {
		System.out.println("Preparing cup of icecream!");
	}

	@Override
	public void garnishIceCream() {
		System.out.println("Garnishing icecream cup with chocolate syrup!");
	}
}
