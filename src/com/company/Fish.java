package com.company;

public class Fish {
  private String name;
   private String color;
   private int weight;

    void setName(String fishName){
        name=fishName;
    }

    void setColor(String fishColor){
        color=fishColor;
    }

    void setWeight(int fishWeight){
        weight=fishWeight;
    }

    String getName(){
        return name;
    }

    String getColor(){
        return color;
    }

    int getWeight(){
        if (weight<1){
            System.out.println("-This fish is so small");
        }else if (weight>1&&weight<3){
            System.out.println("-This fish is normal to eat");
        }else {
            System.out.println("-This fish too big");
        }return weight;
    }
}
