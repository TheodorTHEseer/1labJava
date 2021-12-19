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

    @Override
    public String giveName() {
        String str = this.name;
        return str;
    }
}