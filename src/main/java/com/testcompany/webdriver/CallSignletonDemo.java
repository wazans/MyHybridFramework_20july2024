package com.testcompany.webdriver;

public class CallSignletonDemo {
    public static void main(String[] args) {
        //SingleTonDemo obj=new SingleTonDemo();
        //'SingleTonDemo()' has private access in 'com.testcompany.webdriver.SingleTonDemo' --> error
        SingleTonDemo.getInstance().TestSingleTonMethod();

    }
}
