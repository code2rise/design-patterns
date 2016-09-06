package com.rise;

import com.rise.beverages.BeveragesBase;
import com.rise.beverages.BeveragesTypeEnum;
import com.rise.icecreamcenter.IceCreamBase;
import com.rise.icecreamcenter.IceCreamTypeEnum;

public class FoodMallCounter {

	public static void main(String[] args) {
		
		FoodMallFactoryProducer foodMallFactoryProducer = new FoodMallFactoryProducer();
		FoodMallFactory iceCreamFactory = foodMallFactoryProducer.getFactory("IceCream");
		IceCreamBase iceCream = iceCreamFactory.getIceCream(IceCreamTypeEnum.CONE.name());
		iceCream.prepareIceCream();
		iceCream.garnishIceCream();
		
		FoodMallFactory beverageFactory = foodMallFactoryProducer.getFactory("Beverage");
		BeveragesBase beverage = beverageFactory.getBeverages(BeveragesTypeEnum.MOCKTALE.name());
		beverage.prepareBeverage();
		beverage.addFlavor();
	}

}
