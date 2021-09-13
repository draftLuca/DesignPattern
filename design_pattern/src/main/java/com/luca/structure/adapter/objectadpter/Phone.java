package com.luca.structure.adapter.objectadpter;

public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V,可以~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V,不可以~");
        }
    }
}
