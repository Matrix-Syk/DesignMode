package com.sykun.principle.singleresponsibility;

/**
 * @author Sykun
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        VehicleRoad vehicleRoad = new VehicleRoad();
        vehicleRoad.run("汽车");
        vehicleRoad.run("摩托车");
        VehicleSky vehicleSky = new VehicleSky();
        vehicleSky.run("飞机");
    }
}

// 交通工具类
// 方式2

/**
 * 方案2 分析
 *  1.遵守了单一职责原则
 *  2.但是这样做的改动很大，即将类分解，同时修改客户端，此处及main方法
 *  3.改进：直接修改Vehicle类，改动代码少-->方案3
 */
class VehicleRoad {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}
class VehicleSky {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上飞行...");
    }
}
