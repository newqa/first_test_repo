package com.company.hospital;

public class Patient {

    private String name;
    private String surname;
    private long pesel;

    public Patient () {

    }

    public Patient (String name, String surname, int pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

}
