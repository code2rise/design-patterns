package com.rise;

public class ThreePinConnector implements PowerConnectionStrategy {

	@Override
	public void fetchPower() {
		System.out.println("Fetches power using 3 pin connector!");
	}
}
