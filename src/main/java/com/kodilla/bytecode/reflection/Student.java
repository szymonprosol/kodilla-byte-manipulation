package com.kodilla.bytecode.reflection;

import java.util.Random;

public class Student {

    private String name;
    private String indexNumber = "";
    private Random random = new Random();

    public String number() {
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            indexNumber = indexNumber + value;
        }
        return indexNumber;
    }

    public void setDetails(String name) {
        this.name = name;
        this.indexNumber = number();
    }

    public Student(String name) {
        this.name = name;
        this.indexNumber = number();
    }

    public String getName() {
        return name;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
