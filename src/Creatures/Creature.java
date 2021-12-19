package Creatures;

import com.company.Named;

public class Creature implements Named {
    public String name;
    protected int hp;
    protected int damage;
    protected int lvl;
    protected int dexteritySkill;

    public String shortName;

    public Creature(){
    }

    public Creature (String name, int hp,int dexteritySkill, int damage)
    {
        this.damage = damage;
        this.name=name;
        this.hp=100;
        this.dexteritySkill= dexteritySkill;
    }

    public String getName(){return name;}
    public int getDamage(){return damage;}

    @Override
    public String giveName() {
        String str = this.name;
        return str;
    }
}