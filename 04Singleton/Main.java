package com.ss.basics.concurrency;

public class Main {
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstace();
        singleton.printHello();
    }

}
