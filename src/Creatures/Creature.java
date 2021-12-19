package Creatures;

import com.company.Named;

public class Creature implements Named {
    public String name;
    protected int hp;
    protected int damage;
    protected int lvl;
    protected int armour;


    public Creature(){
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display() {
        System.out.printf("Name: %32s, lvl: %12d\n", this.name,this.lvl);
    }
}