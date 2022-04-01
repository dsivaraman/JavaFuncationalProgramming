package com.thread;

public class ThreadNamePOC {
    public static void main(String[] args) {

        ThreadNaming name = new ThreadNaming();
        name.setName("TBOX Thread");

        name.start();

        if (name.isAlive()) {
            System.out.println("-- alive --");
            System.out.println("name = " + name.getName());
        }

        name.interrupt();

        System.out.println("-- after alive - " + name.isAlive());
    }
}

class ThreadNaming extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("ThreadNaming.run");
    }
}

