package com.luca.creation.bulilder;

/**
 * 普通方式：
 *    将产品(房子）和建造产品的过程封装在一起了，耦合增强
 *  解决：
 *      产品和创建过程解耦  建造者模式（生成器模式）
 *
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }

}
