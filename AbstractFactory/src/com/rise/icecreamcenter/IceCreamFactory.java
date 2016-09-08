package com.rise.icecreamcenter;

import com.rise.FoodMallFactory;
import com.rise.beverages.BeveragesBase;

public class IceCreamFactory extends FoodMallFactory {
	
	@Override
	public IceCreamBase getIceCream(String iceCreamName) {
		
		if(iceCreamName.equalsIgnoreCase(IceCreamTypeEnum.CUP.name())) {
			return new Cup();
		} else if(iceCreamName.equalsIgnoreCase(IceCreamTypeEnum.CONE.name())) {
			return new Cone();
		}
		
		return null;
	}

	@Override
	public BeveragesBase getBeverages(String beveragesName) {
		return null;
	}
}
