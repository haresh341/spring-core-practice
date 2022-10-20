package com.haresh.spring.autowiring;

public class Heart {
    private String nameOfAnimal;
    private int noOfHearts;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHearts() {
        return noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }

    public void pump() {
        System.out.println("your heart is pumping.!");
        System.out.println("Alive");
    }
}
