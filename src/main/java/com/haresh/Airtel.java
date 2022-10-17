package com.haresh;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("calling from airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from airtel sim");
    }
}
