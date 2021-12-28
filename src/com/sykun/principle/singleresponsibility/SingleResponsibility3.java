package com.sykun.principle.singleresponsibility;

/**
 * @author Sykun
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        VehicleChange vehicleChange = new VehicleChange();
        vehicleChange.runRoad("汽车");
        vehicleChange.runSky("飞机");
        vehicleChange.runWater("潜艇");
    }
}

// 交通工具类
// 方式3

/**
 * 方式3分析
 * 1.这种修改方法没有对原来的类做大的修改，只是增加了方法
 * 2.这里虽然没有在类级别遵守单一职责原则，但是在方法级别遵守了单一职责原则
 * 总结:单一职责原则注意事项和细节
 * 1) 降低类的复杂度，一个类只负责一项职责。
 * 2) 提高类的可读性，可维护性
 * 3) 降低变更引起的风险
 * 4) 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违
 *    反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */
class VehicleChange {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runSky(String vehicle) {
        System.out.println(vehicle + "在天空中运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行...");
    }
}



