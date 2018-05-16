package com.company;

public class Humans {
    public static void main(String[] args) {

        Human human = new Human();

        Human human1 = new Human("Ada ", "age: 55");

        Human human2 = new Human();
        human2.setName("Ola");
        human2.setAge(" 44");

        Human human3 = new Human();

        //human1.printHuman();
       /* human2.printHuman();
        human3.printHuman();*/

       // human1.printThisHuman();
        human1.printThisHuman();
        System.out.println(human2.getName() + human2.getAge());
    }
}