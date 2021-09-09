package com.luca.creation.bulilder.improve;

public class HighHouse extends HouseBuilder{
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    public void buildWall() {
        System.out.println("高楼砌墙20cm");
    }

    public void roofed() {
        System.out.println("高楼透明的屋顶");
    }
}
