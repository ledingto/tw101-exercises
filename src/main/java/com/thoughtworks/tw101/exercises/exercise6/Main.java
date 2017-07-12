package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<Monster>();

        // create 5 orc and troll objects each and store in list
        for (int i=1; i<6; i++) {
            monsters.add(new Orc("Orc"+i));
            monsters.add(new Troll("Troll"+i));
        }

        // damage all the monsters by 10 points
        for (int j=0; j<monsters.size(); j++) {
            monsters.get(j).takeDamage(10);
        }

        // report the status of all the monsters
        for (int j=0; j<monsters.size(); j++) {
            monsters.get(j).reportStatus();
        }

    }
}
