package com.rise;

public interface INoticeBoard {
	void registerObserver(INoticeObserver newObserver);
	void unregisterObserver(INoticeObserver deleteObserver);
	void publishNotice(String notice);
}
