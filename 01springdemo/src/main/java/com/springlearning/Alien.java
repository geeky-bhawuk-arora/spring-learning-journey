package com.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    // private Laptop lap = new Laptop();
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public Alien(int age, Laptop Lap) {
        System.out.println("Alien Para Constructor Called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // System.out.println("Setter Called");
        this.age = age;
    }

    // public Laptop getLap() {
    //     return lap;
    // }

    // public void setLap(Laptop lap) {
    //     this.lap = lap;
    // }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        // lap.compile();
        com.compile(); 
    }

    public void test() {
        System.out.println("Alien test method");
    }
}
