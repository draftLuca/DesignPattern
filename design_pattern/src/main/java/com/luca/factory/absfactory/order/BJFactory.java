package com.luca.factory.absfactory.order;


import com.luca.factory.absfactory.BJCheesePizza;
import com.luca.factory.absfactory.BJPepperPizza;
import com.luca.factory.absfactory.Pizza;

//这是工厂子类
public class BJFactory implements AbsFactory {


	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}