package com.company;

import Creatures.Enemy;
import Items.Weaponry;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList <Weaponry> weaponry = generateArrayOfWeaponry();
    ArrayList<Enemy> enemies = generateArrayOfEnemies();
    showArrayW(weaponry);
    showArrayE(enemies);

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

    private static void showArrayW(ArrayList<Weaponry> arrayList){
        for (int count=0; count<arrayList.size();count++)
            System.out.println(arrayList.get(count).getName());
    }
    private static void showArrayE(ArrayList<Enemy> arrayList){
        for (int count=0; count<arrayList.size();count++)
            System.out.println(arrayList.get(count).getName());
    }
}
