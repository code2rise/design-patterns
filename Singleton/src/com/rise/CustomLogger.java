package com.rise;

import java.beans.Customizer;

public class CustomLogger {
		
	private CustomLogger() {
		
	}
	
	public static CustomLogger getInstance() {
		
		return SingletonHelper.CUSTOM_LOGGER;
	}
	
	public void log(String log) {
		
		System.out.println(log);
	}
	
	private static class SingletonHelper {
		
		private static final CustomLogger CUSTOM_LOGGER = new CustomLogger();
	}
}
