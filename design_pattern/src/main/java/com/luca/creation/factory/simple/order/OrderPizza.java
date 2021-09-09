package com.luca.creation.factory.simple.order;

import com.luca.creation.factory.simple.Pizza;
import com.luca.creation.factory.simple.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 此处代码问题，违反opc原则，当新增加一种pizza时，orderpizza类也必须做修改
 * 修改思路：
 * 创建一个工厂类，专门创建pizza,以后pizza有修改时只用改动这个工厂类
 */
public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			}else {
//                break;
//            }
//            //输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while(true);
//    }

    //定义简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }
    public void setFactory(SimpleFactory simpleFactory) {
        //用户输入
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            Pizza pizza = simpleFactory.createPizza(orderType);
            //输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        } while (true);

    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
