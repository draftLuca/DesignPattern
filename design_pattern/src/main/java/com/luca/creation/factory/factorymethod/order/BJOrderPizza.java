package com.luca.creation.factory.factorymethod.order;

import com.luca.creation.factory.factorymethod.BJCheesePizza;
import com.luca.creation.factory.factorymethod.BJPepperPizza;
import com.luca.creation.factory.factorymethod.Pizza;


public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
