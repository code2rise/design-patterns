package com.rise;

public class StudentNoticeObserver implements INoticeObserver {

	private static int currentObserverId;
	private int observerId;
	
	public StudentNoticeObserver() {
		observerId = ++currentObserverId;
	}
	
	@Override
	public void updateNotice(String notice) {
		
		System.out.println("Observer Id : " + observerId + " Notice : " + notice);
	}
}
