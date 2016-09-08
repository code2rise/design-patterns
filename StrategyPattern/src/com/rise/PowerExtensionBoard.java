package com.rise;

public class PowerExtensionBoard {

	public PowerConnectionStrategy powerConnectionStrategy;

	public PowerExtensionBoard(PowerConnectionStrategy powerConnectionStrategy) {
		this.powerConnectionStrategy = powerConnectionStrategy;
	}
	
	public void setPowerConnectionStrategy(PowerConnectionStrategy powerConnectionStrategy) {
		this.powerConnectionStrategy = powerConnectionStrategy;
	}
	
	public void fetchPower() {
		if(powerConnectionStrategy == null) {
			throw new NullPointerException("Please specify the strategy to fetch power!");
		}
		
		powerConnectionStrategy.fetchPower();
	}
}
