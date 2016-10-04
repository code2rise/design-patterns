package com.rise;

public class MainClass {

	public static void main(String[] args) {
		UpdateNotifier updateNotifier = new UpdateNotifier();
		Observer observer1 = new Client();
		Observer observer2 = new Client();
		
		updateNotifier.registerObserver(observer1);
		updateNotifier.registerObserver(observer2);
		
		updateNotifier.setStockName("Jack");
		updateNotifier.setStockName("Sam");
	}

}
