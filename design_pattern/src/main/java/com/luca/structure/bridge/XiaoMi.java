package com.luca.structure.bridge;

public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("Xiao Mi open!");
    }

    @Override
    public void close() {
        System.out.println("Xiao Mi close!");
    }

    @Override
    public void call() {
        System.out.println("Xiao Mi call!");
    }
}
