package com.pack;

public abstract class BaseClass {

    public abstract BaseResponseClass getInstance();

    public void display() {
        getInstance().show();
    }
}
