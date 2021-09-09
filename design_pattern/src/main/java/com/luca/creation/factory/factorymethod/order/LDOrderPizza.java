package com.luca.creation.factory.factorymethod.order;


import com.luca.creation.factory.factorymethod.LDCheesePizza;
import com.luca.creation.factory.factorymethod.LDPepperPizza;
import com.luca.creation.factory.factorymethod.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
