package com.luca.creation.prototype;

import java.io.*;

public class Sheep implements Cloneable, Serializable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古🐏";

    public Sheep friend;
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //克隆该实例，使用默认的clone的方法完成
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
            //深拷贝，将聚合的类也克隆
            if (sheep.friend != null) {
                sheep.friend = (Sheep)sheep.friend.clone();
            }
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    public Object deepClone() {
        //创建流对象
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep)ois.readObject();
            return sheep;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
