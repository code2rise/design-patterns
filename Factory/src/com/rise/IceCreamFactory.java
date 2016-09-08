package com.rise;

public class IceCreamFactory {

	public IceCreamCreator iceCreamCreator;
	
	public IceCreamCreator makeIceCream(String iceCreamName) {
		
		switch (iceCreamName) {
		case "Cone": {
			iceCreamCreator = new Cone();
			break;
		}
		case "Cup": {
			iceCreamCreator = new Cup();
			break;
		}
		case "Cassata": {
			iceCreamCreator = new Cassata();
			break;
		}
		default: {
			return null;
		}
		}
		
		return iceCreamCreator;
	} 
}
