package com.company;

import Creatures.Enemy;
import Items.Equipment;
import Items.Weaponry;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList <Weaponry> weapons = generateArrayOfWeaponry();
    ArrayList<Enemy> enemies = generateArrayOfEnemies();
        System.out.println("---Weapons---");
        for (Weaponry weaponry:weapons) {
        weaponry.display();
        }
        System.out.println("---Enemies---");
        for (Enemy enemy:enemies) {
            enemy.display();
        }

    }
    private static ArrayList generateArrayOfWeaponry(){
        ArrayList<Weaponry> arrayList= new ArrayList<>();
        for (int count =0; count<10;count++)
            arrayList.add(new Weaponry());
        return arrayList;
    }

    private static ArrayList generateArrayOfEnemies(){
        ArrayList<Enemy> arrayList= new ArrayList<>();
        for (int count =0; count<10;count++)
            arrayList.add(new Enemy());
        return arrayList;
    }

}
