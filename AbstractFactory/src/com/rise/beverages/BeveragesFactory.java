package com.rise.beverages;

import com.rise.FoodMallFactory;
import com.rise.icecreamcenter.IceCreamBase;

public class BeveragesFactory extends FoodMallFactory {
	
	BeveragesBase beverage = null;
	
	@Override
	public IceCreamBase getIceCream(String iceCreamName) {
		return null;
	}

	@Override
	public BeveragesBase getBeverages(String beverageName) {
		
		if(beverageName.equalsIgnoreCase(BeveragesTypeEnum.JUICE.name())) {
			beverage = new Juice();
		}
		else if(beverageName.equalsIgnoreCase(BeveragesTypeEnum.MOCKTALE.name())) {
			beverage = new Mocktale();
		}
		
		return beverage;
	}
}
