package com.rise;

public class TwoPinConnector implements PowerConnectionStrategy {

	@Override
	public void fetchPower() {
		System.out.println("Fetches power using 2 pin connector!");
	}
}
