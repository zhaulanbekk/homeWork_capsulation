package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\t\t\t>Fish<");
        Fish fish = new Fish();
        fish.setName("Theo");
        fish.setColor("Black/white/grey/gold");
        fish.setWeight(2);

        System.out.println("-Fish name: " + fish.getName() + "\n" + "-Fish color: " + fish.getColor() + "\n" + "-Fish weight: " + fish.getWeight()+"kg");
        System.out.println("_____________________");
        System.out.println();

        System.out.println("\t\t==>Parrot<==");
        Parrot parrot = new Parrot();
        parrot.setName("Rio");
        parrot.setKind("Birds");
        parrot.setAge(6);

        System.out.println("->Parrot name: " + parrot.getName() + "\n" + "->Parrot kind: " + parrot.getKind() + "\n" + "->Parrot age: " + parrot.getAge()+" y.o");
        System.out.println("_______________________");
        System.out.println();

        System.out.println("\t\t==|Dog|==");
        Dog dog=new Dog();
        dog.setName("Ak tosh");
        dog.setKind("Buldog");
        dog.setAge(2);
        dog.setWeight(13);

        System.out.println("* Dog name: " + dog.getName() + "\n" + "* Dog kind: " + dog.getKind() + "\n" + "* Dog age: " + dog.getAge() + "\n" + "* Dog weight: " + dog.getWeight()+"kg");
        System.out.println("________________________");
        System.out.println();

        System.out.println("\t\t^^^^Cat^^^^");
        Cat cat=new Cat();
        cat.setName("Tom");
        cat.setColor("black/white");
        cat.setAge(2);
        cat.setHeight(25);

        System.out.println("~Cat name is: " + cat.getName() + "\n" + "~Cat color is: " + cat.getColor() + "\n" + "~Cat age: " + cat.getAge() + "\n" + "~Cat height: " + cat.getHeight() + "cm");
        System.out.println("__________________________");
    }
}
