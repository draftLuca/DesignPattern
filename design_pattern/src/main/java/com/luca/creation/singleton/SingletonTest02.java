package com.luca.creation.singleton;

/**
 * 懒汉式测试
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance==instance1);
        System.out.println("instance" + instance.hashCode());
        System.out.println("instance1" + instance1.hashCode());

        Singleton5 instance2 = Singleton5.getInstance();
        Singleton5 instance3 = Singleton5.getInstance();
        System.out.println(instance2==instance3);
        System.out.println("instance" + instance2.hashCode());
        System.out.println("instance1" + instance3.hashCode());

        Singleton7 instance4 = Singleton7.INSTANCE;
        Singleton7 instance5 = Singleton7.INSTANCE;
        instance5.sayOK();
        System.out.println(instance4==instance5);
        System.out.println("instance" + instance4.hashCode());
        System.out.println("instance1" + instance5.hashCode());
    }
}

/**
 * 1懒汉式（线程不安全）
 *  优：
 *     达到lazy loading,
 *  缺：
 *     只能单线程下使用，多线程会有多个实例被创建，实际开发不用
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供静态共有方法
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * 2懒汉式（线程安全）
 *  优：
 *     达到lazy loading,
 *  缺：
 *     效率太低
 */
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {}

    //提供静态共有方法，加入synchronized,解决线程问题
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 错误例子：
 * 懒汉式（同步代码块） 错误写法
 *  这种写法本意解决效率问题，可是实际并不能保证线程安全，效率还低
 */
class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {}

    //提供静态共有方法，
    public static Singleton4 getInstance() {
        if (instance == null) {
            //加入synchronized,解决线程问题
            synchronized (Singleton.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }
}

/**
 * 3懒汉式（线程安全,双重检查）
 *    优：
 *       达到lazy loading,线程安全，效率也提升，推荐使用
 *
 */
class Singleton5 {
    //加volatile 防止指令重排 线程拿到未初始化过的引用
    private static volatile Singleton5 instance;

    private Singleton5() {}

    //提供静态共有方法，
    public static Singleton5 getInstance() {
        if (instance == null) {
            //加入synchronized,解决线程问题
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

/**
 * 4懒汉式（静态内部类）
 *  优：
 *     达到lazy loading，延迟加载,线程安全效率高，推荐使用
 *
 */
class Singleton6 {

    private Singleton6() {}

    /**
     * 特点：
     * 1.外部类被装载的时候静态内部类不会被装载
     * 2.当getInstance使用静态内部类时候才会被装载
     * 3.装载过程线程安全，且静态内部类只会被装载一次
     */
    private static class SingletonInstance {
        private static final Singleton6 instance = new Singleton6();
    }
    //提供静态共有方法
    public static Singleton6 getInstance() {
        return SingletonInstance.instance;
    }
}

/**
 * 5懒汉式（枚举）
 *  优：
 *     达到lazy loading,避免了线程问题，防止放序列化
 *     josh bloch 提倡使用
 *
 */
enum Singleton7 {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok~");
    }
}