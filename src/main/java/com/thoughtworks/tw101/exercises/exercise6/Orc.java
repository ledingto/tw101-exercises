package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {

    private String name;
    private int status;

    public Orc() {
        status = 20;
    }

    public Orc(String name) {
        this.name = name;
        status = 20;
    }

    @Override
    public void takeDamage(int amount) {
        int damage = amount;
        if (status-damage<0) {
            status = 0;
        }
        else {
            status = status - damage;
        }
    }

    @Override
    public void reportStatus() {
        if (status <= 0) {
            System.out.println(name + " is dead.");
        }
        else {
            System.out.println(name + " has " + status + " hitpoints remaining.");
        }
    }

}
