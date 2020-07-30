package com.luca.factory.absfactory.order;


import com.luca.factory.absfactory.LDCheesePizza;
import com.luca.factory.absfactory.LDPepperPizza;
import com.luca.factory.absfactory.Pizza;

public class LDFactory implements AbsFactory {

	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
