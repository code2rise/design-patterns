package com.rise.beverages;

public class Juice extends BeveragesBase {

	@Override
	public void prepareBeverage() {
		System.out.println("Preparing a fruit juice!");
	}

	@Override
	public void addFlavor() {
		System.out.println("Try some new flavors to enhance juice taste!");
	}

}
