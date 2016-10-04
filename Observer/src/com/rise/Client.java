package com.rise;

public class Client implements Observer {

	private static int currentObserverId;
	private int observerid;
	
	public Client() {
		
		observerid = ++currentObserverId;
	}
	
	@Override
	public void update(String stockData) {
		System.out.println(observerid + " : Updated Data : " + stockData);
	}
}
