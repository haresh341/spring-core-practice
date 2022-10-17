package com.haresh;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling from vodafone sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from vodafone sim");
    }
}
