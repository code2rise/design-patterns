package com.rise;

import java.util.ArrayList;

public class UpdateNotifier implements Subject {

	private String stockName;

	private ArrayList<Observer> observers = new ArrayList<>();
	
	@Override
	public void notifyObservers() {
		for(Observer client : observers) {
			client.update(stockName);
		}
	}

	@Override
	public void registerObserver(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregisterObserver(Observer deleteObserver) {
		observers.remove(deleteObserver);
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
		
		notifyObservers();
	}
}
