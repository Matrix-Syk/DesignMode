package com.sykun.principle.segregation;

/**
 * 下面的代码违反了接口隔离的原则
 *
 */
public interface Interface1 {
    public void operation1();

    public void operation2();

    public void operation3();

    public void operation4();

    public void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B1");
    }

    @Override
    public void operation2() {
        System.out.println("B2");
    }

    @Override
    public void operation3() {
        System.out.println("B3");
    }

    @Override
    public void operation4() {
        System.out.println("B4");
    }

    @Override
    public void operation5() {
        System.out.println("B5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D1");
    }

    @Override
    public void operation2() {
        System.out.println("D2");
    }

    @Override
    public void operation3() {
        System.out.println("D3");
    }

    @Override
    public void operation4() {
        System.out.println("D4");
    }

    @Override
    public void operation5() {
        System.out.println("D5");
    }
}

/**
 * A 类通过接口Interface1依赖B类，但是只会用到1，4，5方法
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation4();
    }

    public void depend3(Interface1 i) {
        i.operation5();
    }
}

/**
 * C 类通过接口Interface1依赖D类，但是只会用到1，4，5方法
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}
