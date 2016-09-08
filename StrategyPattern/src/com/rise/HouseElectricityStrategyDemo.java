package com.rise;

public class HouseElectricityStrategyDemo {

	public static void main(String[] args) {
		
		PowerExtensionBoard powerExtensionBoard = new PowerExtensionBoard(new ThreePinConnector());
		powerExtensionBoard.fetchPower();
		
		powerExtensionBoard = new PowerExtensionBoard(new TwoPinConnector());
		powerExtensionBoard.fetchPower();
		
		powerExtensionBoard = new PowerExtensionBoard(new PowerAdapterConnector());
		powerExtensionBoard.fetchPower();
	}
}
