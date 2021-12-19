package Creatures;

import Items.Equipment;
import Items.Item;

import java.util.Random;

public class Hero extends Creature {
    Random rnd = new Random();

    Hero(){
        this.name=HNames[rnd.nextInt(HNames.length)];
        this.lvl=rnd.nextInt(10-1)+1;
        this.hp=lvl*rnd.nextInt(25-10)+10;
        this.armour=lvl*rnd.nextInt(15-5)+5;
        this.damage=lvl*5;
    }
    public void checkLvl(Item item){
        if (this.lvl>=item.getRequiredLvl())
            System.out.println("Экипировка надета!");
        else
            System.out.println("Экипировка Вам не подходит!");
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public static String [] HNames = {"Гавейн", "Ланселот", "Ламорак" , "Бомейн", "Мордред", "Уриенс", "Борс", "Оуэн",
            "Гахерис", /*тут начинается тес*/"Лоркалин", "Агила", "Агвар", "Лларен", "Уриэль","Небия", "Маннимарко", "Николин"};
}
