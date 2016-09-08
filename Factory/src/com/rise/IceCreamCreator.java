package com.rise;

public abstract class IceCreamCreator {

	String iceCreamType = "";
	
	public void setIceCreamType(String iceCreamType) {
		
		this.iceCreamType = iceCreamType; 
	}
	
	protected abstract void prepareIceCream();
	protected abstract void garnishIceCream();
}
