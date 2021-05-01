package com.company;

public class Humans {
    public static void main(String[] args) {

        Human human1 = new Human("Ada ", "age: 55");

        Human human2 = new Human();
        human2.setName("Ola");
        human2.setAge(" 44");

        Human human3 = new Human();

        human1.printThisHuman(human1);
        human2.printThisHuman(human2);
        human3.printThisHuman(human3);
    }
}