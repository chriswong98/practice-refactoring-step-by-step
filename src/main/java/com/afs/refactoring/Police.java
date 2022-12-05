package com.afs.refactoring;

public class Police {

    public static final int MIN_ADULT_AGE = 18;

    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= MIN_ADULT_AGE;
    }
}
