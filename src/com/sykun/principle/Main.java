package com.sykun.principle;

import com.sykun.principle.singleton.hungry.StaticVariable;

// 测试
public class Main {
    public static void main(String[] args) {
        // 单例模式->饿汉模式(静态变量实现)
        StaticVariable instance1 = StaticVariable.getInstance();
        StaticVariable instance2 = StaticVariable.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
