package com.luca.structure.adapter.objectadpter;

//对象适配器
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V) {
            int srcV= voltage220V.output220V();
            dstV = srcV/44;
        }
        return dstV;
    }
}
