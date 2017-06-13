package com.company;

/**
 * Created by Bhajian on 5/23/2017.
 */
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int wight;

    public Animal(String name, int brain, int body, int size, int wight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.wight = wight;
    }
    public void eate(){
        System.out.println("Animal eate() was called!");


    }
    public void move(){

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWight() {
        return wight;
    }
}
