package com.luca.creation.singleton;

/**
 * 饿汉式测试
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
    }
}

/**
 * 饿汉式（静态变量）
 * 优：
 *  避免了多线程问题
 * 缺
 *  类装载时就实例化，没有达到Lazy loading,如未使用，浪费
 */

class Singleton1 {

    //私有化构造
    private Singleton1 () {};

    private final static Singleton1 instance = new Singleton1();

    public static  Singleton1 getInstance() {
        return instance;
    }
}

/**
 * 饿汉式（静态代码）
 * 优：
 *  避免了多线程问题
 * 缺
 *  类装载时就实例化，没有达到Lazy loading,如未使用，浪费
 */

class Singleton2 {

    private static Singleton2 instance;
    //私有化构造
    private Singleton2 () {
    }
    static {
         instance = new Singleton2();
    }
    public static  Singleton2 getInstance() {
        return instance;
    }
}