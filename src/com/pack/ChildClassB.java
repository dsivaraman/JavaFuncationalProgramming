package com.pack;

public class ChildClassB extends BaseClass {

    public static void main(String[] args) {
        System.out.println("ChildClassB.main");
        ChildClassB childClassB = new ChildClassB();
        childClassB.display();
    }

    @Override
    public BaseResponseClass getInstance() {
        return new ChildResponseClassB();
    }
}
