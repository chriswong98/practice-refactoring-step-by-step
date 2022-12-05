package com.afs.refactoring;

public class Driver {
    private int age;
    public static final int MIN_ADULT_AGE = 18;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult(){
        return getAge() >= MIN_ADULT_AGE;
    }
}
