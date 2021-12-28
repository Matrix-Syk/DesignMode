package com.sykun.principle.singleresponsibility;

/**
 * @author Sykun
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

// 交通工具类
// 方式1

/**
 * 1.在方式1的run方法中违反了单依职责原则
 * 2.解决方案:根据交通方式的不同设计不同的类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}

