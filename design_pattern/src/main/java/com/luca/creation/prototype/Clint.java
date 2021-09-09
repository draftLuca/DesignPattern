package com.luca.creation.prototype;

public class Clint {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack",2,"黑色");
        //克隆 方式深拷贝
        Sheep sheep1 = (Sheep)sheep.clone();
        /**
         * 浅拷贝：
         *      基本类型，值会拷贝一份；引用类型只会拷贝指针，不会拷贝内容
         * 深拷贝：
         *      所有内容都拷贝
         *    实现
         *      1，clone:重写clone方法，所依赖的类也得重写clone()
         *      2, 序列化 推荐使用
         */
        System.out.println("sheep"+sheep+" friend:"+sheep.friend.hashCode()+" "+sheep.friend);
        System.out.println("sheep1"+sheep1+" friend:"+sheep1.friend.hashCode()+" " +sheep1.friend);

        //序列化方式深拷贝
        Sheep sheep2 = (Sheep)sheep.deepClone();

        System.out.println("sheep"+sheep+" friend:"+sheep.friend.hashCode()+" "+sheep.friend);
        System.out.println("sheep1"+sheep2+" friend:"+sheep2.friend.hashCode()+" " +sheep2.friend);


    }
}
