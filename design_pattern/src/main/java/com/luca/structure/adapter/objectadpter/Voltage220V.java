package com.luca.structure.adapter.objectadpter;

//被适配的类
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
