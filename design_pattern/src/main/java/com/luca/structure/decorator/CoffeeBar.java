package com.luca.structure.decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        //装饰者模式下订单： 2份巧克力 + 一份牛奶的LongBlack


        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        //加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶费用=" + order.cost());
        System.out.println("order加入一份牛奶描述=" + order.getDes());

        //加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶加入一份巧克力 费用=" + order.cost());
        System.out.println("order加入一份牛奶加入一份巧克力 描述=" + order.getDes());

        //加入2份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶加入2份巧克力 费用=" + order.cost());
        System.out.println("order加入一份牛奶加入2份巧克力 描述=" + order.getDes());
    }
}
