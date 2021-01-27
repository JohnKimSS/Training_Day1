package com.ss.basics.concurrency;
/**
 * @Author John Kimn
 */
public class Singleton {
    
    volatile private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        synchronized (instance) {
            if(instance == null) {
                synchronized(Singleton.class) {
                    if(instance == null) {
                        instance = new Singleton();
                    }
                }
            }
        }
        return instance;
    }

    public void printHello() {
        System.out.println('hello');
    }

}
