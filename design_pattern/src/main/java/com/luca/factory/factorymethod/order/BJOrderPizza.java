package com.luca.factory.factorymethod.order;

import com.luca.factory.factorymethod.BJCheesePizza;
import com.luca.factory.factorymethod.BJPepperPizza;
import com.luca.factory.factorymethod.Pizza;


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
