package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private String name;
    private int status;

    public Troll() {
        status = 40;
    }

    public Troll(String name) {
        this.name = name;
        status = 40;
    }

    @Override
    public void takeDamage(int amount) {
        float damage = amount / 2;
        if (status-damage<0) {
            status = 0;
        }
        else {
            status -= damage;
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
