package com.luca.creation.factory.absfactory.order;

/**
 * 抽象工厂:相比于简单工厂，在工厂层又抽象了一层，使得程序的扩展性更好
 */
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
