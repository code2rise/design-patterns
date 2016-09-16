package com.rise;

import javax.lang.model.element.QualifiedNameable;

public class Dog extends Animal {
	
	private boolean sniff = true;
	
	private String getBreed() {
		return "Rottweiler";
	}
	
	private void feed(String food, int quantity) {
		System.out.println("Feed dog " + quantity + " " + food);
	}
}
