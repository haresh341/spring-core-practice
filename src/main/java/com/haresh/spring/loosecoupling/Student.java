package com.haresh.spring.loosecoupling;

public class Student {
    private int id;
    private Cheat cheat;

    public Student(int id, Cheat cheat) {
        this.id = id;
        this.cheat = cheat;
    }

    public void cheating() {
        cheat.cheat();
    }
}
