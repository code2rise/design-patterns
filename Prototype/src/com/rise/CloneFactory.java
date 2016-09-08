package com.rise;

public class CloneFactory {

	public Prototype makeClone(Prototype product) {
		
		return product.makeClone();
	}
}
