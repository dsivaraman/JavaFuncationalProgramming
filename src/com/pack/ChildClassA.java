package com.pack;

public class ChildClassA extends BaseClass {

    public static void main(String[] args) {
        System.out.println("ChildClassA.main");
        ChildClassA childClassA = new ChildClassA();
        childClassA.display();
    }

    @Override
    public BaseResponseClass getInstance() {
        return new ChildResponseClassA();
    }
}
