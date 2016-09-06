package com.rise;

public interface Subject {
	void registerObserver(Observer newObserver);
	void unregisterObserver(Observer deleteObserver);
	void notifyObservers();
}
