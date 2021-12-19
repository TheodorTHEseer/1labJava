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
}