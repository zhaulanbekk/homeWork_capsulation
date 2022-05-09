package com.company;

public class Dog {
    String name;
    String kind;
    int age;
    int weight;

    void setName(String dogName){
        name=dogName;
    }
    void setKind(String dogKind){
        kind=dogKind;
    }
    void setAge(int dogAge){
        age=dogAge;
    }
    void setWeight(int dogWeight){
        weight=dogWeight;
    }

    String getName(){
        return name;
    }

    String getKind(){
        return kind;
    }

    int getAge(){
        if (age<1){
            System.out.println("Bul ali kuchuk");
        }else {
            System.out.println("Etiyat bol bul it bolup kalgan");
        }return age;
    }

    int getWeight(){
        return weight;
    }
}
