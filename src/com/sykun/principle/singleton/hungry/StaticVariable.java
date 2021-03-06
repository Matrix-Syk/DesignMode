package com.sykun.principle.singleton.hungry;

/**
 * 饿汉式(静态变量)
 * 将构造方法私有化,再利用静态变量返回一个初始化时就会创建的对象,
 * 使用公有的静态方法获取,始终获取的都是同一个对象
 *
 * 优缺点说明：
 * 1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 2) 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始
 * 至终从未使用过这个实例，则会造成内存的浪费
 * 3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载
 * 时就实例化，在单例模式中大多数都是调用getInstance方法，
 * 但是导致类装载
 * 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类
 * 装载，这时候初始化instance就没有达到lazy loading的效果
 * 4) 结论：这种单例模式可用，可能造成内存浪费
 */
public class StaticVariable {

    // 构造器私有化
    private StaticVariable() {
    }

    // 本类内部创建对象实例
    private final static StaticVariable instance = new StaticVariable();

    // 提供一个公有的静态方法,返回实例对象
    public static StaticVariable getInstance(){
        return instance;
    }

}
