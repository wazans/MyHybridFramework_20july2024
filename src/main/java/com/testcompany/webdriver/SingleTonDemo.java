package com.testcompany.webdriver;

public class SingleTonDemo {
    private static SingleTonDemo INSTANCE;

    private SingleTonDemo() {
        // Private constructor to prevent instantiation
    }

    public static SingleTonDemo getInstance() {
        if (INSTANCE == null) {
            //SingleTonDemo INSTANCE=new SingleTonDemo()
            INSTANCE = new SingleTonDemo();//make object
        }
        return INSTANCE;
    }
    public static void TestSingleTonMethod()
    {
        System.out.println("test a single method");
    }


}
