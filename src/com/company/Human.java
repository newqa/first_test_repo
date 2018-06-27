package com.company;

public class Human {
    private String name;
    private String age;

    public Human() {
    }

    public Human(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Human printThisHuman(){
        System.out.println(getName() + getAge());
        return this;
    }
}