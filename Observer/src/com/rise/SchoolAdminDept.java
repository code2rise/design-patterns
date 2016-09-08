package com.rise;

public class SchoolAdminDept {

	public static void main(String[] args) {
		NoticeBoardPublisher publisher = new NoticeBoardPublisher();
		
		INoticeObserver student1 = new StudentNoticeObserver();
		INoticeObserver student2 = new StudentNoticeObserver();
		INoticeObserver student3 = new StudentNoticeObserver();
		INoticeObserver student4 = new StudentNoticeObserver();
		
		publisher.registerObserver(student1);
		publisher.registerObserver(student2);
		publisher.publishNotice("Holiday on next monday.");
		
		publisher.registerObserver(student3);
		publisher.registerObserver(student4);
		publisher.publishNotice("Exams in the next month.");
		
	}

}
