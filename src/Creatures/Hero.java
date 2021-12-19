package Creatures;


import Items.Weaponry;

import java.util.Random;

public class Hero extends Creature {

    Random rnd = new Random();
    private int exp,money;
    private int defaultDamage;
    //Getters
    public int getMoney(){return money;}
    public int getExp(){return exp;}
    public int getDefaultDamage(){return defaultDamage;}
    //Setters
    public void setMoney(int money){this.money = money;}
    public void setExp(int exp){this.exp = exp;}

    public static String [] HNames = {"Гавейн", "Ланселот", "Ламорак" , "Бомейн", "Мордред", "Уриенс", "Борс", "Оуэн",
            "Гахерис", /*тут начинается тес*/"Лоркалин", "Агила", "Агвар", "Лларен", "Уриэль","Небия", "Маннимарко", "Николин"};
    private String [] MagicNames = {"Огонь", "Вода", "Воздух"};

    char holdspace;
    public Hero (String name, int hp, int damage, int exp, int dexteritySkill, int money) {
        super(name, hp, dexteritySkill, damage);
        holdspace = name.charAt(0);
        this.shortName= "["+holdspace + "]";
        this.money = money;
        this.exp = exp;
        this.damage=damage;
        this.defaultDamage=damage;
        this.lvl = exp /1000;
    }

    public void display(){
        System.out.println(getName() + " dmg: " + this.getDamage());
    }

    public void giveStartedSword(){
        Random rnd = new Random();
        Weaponry mySword = new Weaponry("Мой меч", 1, rnd.nextInt(50- 1)+1);
        this.Equipment.add(mySword);
    }
}
