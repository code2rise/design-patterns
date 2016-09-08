package com.rise;

import com.rise.beverages.BeveragesFactory;
import com.rise.icecreamcenter.IceCreamFactory;

public class FoodMallFactoryProducer {

	public FoodMallFactory getFactory(String name) {
		switch (name) {
		case "IceCream": {
			return new IceCreamFactory();
		}
		case "Beverage": {
			return new BeveragesFactory();
		}
		}
		
		return null;
	}
}
