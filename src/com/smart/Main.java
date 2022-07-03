package com.smart;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone =  new SmartPhone("Android", "Mediatek", "2400 x 1080 ", 6.43, 5000, 128, 4);

        SmartWatch watch = new SmartWatch();

        System.out.println(phone.toString());

    }
}
