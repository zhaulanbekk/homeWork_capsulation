package com.company;

public class Parrot {
    private String name;
    private String kind;
    private int age;



    void setName(String parrotName) {
       name= parrotName;
    }

    void setKind(String parrotKind) {
       kind= parrotKind;
    }

    void setAge(int parrotAge) {
       age= parrotAge;
    }

    String getName() {
        return name;
    }

    String getKind() {
        return kind;
    }


    int getAge() {
        return age;
    }
}

