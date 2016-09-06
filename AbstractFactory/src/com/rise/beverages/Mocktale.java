package com.rise.beverages;

public class Mocktale extends BeveragesBase {

	@Override
	public void prepareBeverage() {
		System.out.println("Preparing a mocktale!");
	}

	@Override
	public void addFlavor() {
		System.out.println("How about some more flavors!");
	}
}
