package com.rise;

import java.util.ArrayList;

public class NoticeBoardPublisher implements INoticeBoard {

	private ArrayList<INoticeObserver> noticeObservers = new ArrayList<>();
	
	
	@Override
	public void registerObserver(INoticeObserver newObserver) {
		
		if( !noticeObservers.contains(newObserver) ) {
			noticeObservers.add(newObserver);
		}
	}

	@Override
	public void unregisterObserver(INoticeObserver deleteObserver) {
		
		noticeObservers.remove(deleteObserver);	
	}

	@Override
	public void publishNotice(String notice) {

		for(INoticeObserver observer : noticeObservers) {
			observer.updateNotice(notice);
		}
	}
}
