package com.company;

/**
 * Created by Bhajian on 5/23/2017.
 */
public class Dog extends Animal {
    private int eye;
    private int teeth;
    private int leg;
    private int tail;
    private String coat;

    public Dog(String name, int size, int wight, int eye, int teeth, int leg, int tail, String coat) {
        super(name, 1, 1, size, wight);
        this.eye = eye;
        this.teeth = teeth;
        this.leg = leg;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chew method was called!");
    }

    @Override
    public void eate() {
        System.out.println("Dog eate method was called!");
        chew();
        super.eate();
    }
}
