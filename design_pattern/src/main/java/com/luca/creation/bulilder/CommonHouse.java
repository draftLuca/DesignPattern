package com.luca.creation.bulilder;


public class CommonHouse extends AbstractHouse{
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
