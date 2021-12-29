package com.sykun.principle.segregation.change;

/**
 * 下面的代码解决了上述的问题
 * 类之间通过接口产生依赖,对于一些功能(方法)用不到但是却必须事先,就可以使用拆分的方法
 * 如下,实现多个接口避免重写多余的方法
 */
public interface Interface1 {
    public void operation1();
}

interface Interface2 {
    public void operation2();

    public void operation3();
}

interface Interface3 {
    public void operation4();

    public void operation5();
}

class B implements Interface1,Interface2 {
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
}

class D implements Interface1,Interface3 {
    @Override
    public void operation1() {
        System.out.println("D1");
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
 * A 类通过接口Interface1依赖B类，但是只会用到1，2，3方法
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C 类通过接口Interface1依赖D类，但是只会用到1，4，5方法
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface3 i) {
        i.operation4();
    }

    public void depend3(Interface3 i) {
        i.operation5();
    }
}
