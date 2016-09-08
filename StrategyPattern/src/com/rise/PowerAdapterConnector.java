package com.rise;

public class PowerAdapterConnector implements PowerConnectionStrategy {

	@Override
	public void fetchPower() {
		System.out.println("Fetches limited power by using power adapter!");
	}

}
