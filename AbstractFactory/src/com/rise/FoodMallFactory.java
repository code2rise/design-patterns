package com.rise;

import com.rise.beverages.BeveragesBase;
import com.rise.icecreamcenter.IceCreamBase;

public abstract class FoodMallFactory {
	public abstract IceCreamBase getIceCream(String iceCreamName);
	public abstract BeveragesBase getBeverages(String beveragesName);
}
