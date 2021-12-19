package Creatures;


import Items.Weaponry;

import java.util.Random;

public class Enemy extends Creature {
    Random rnd = new Random();

    public static String[][] Names = {{"Мол", "Гоур", "Фре", "Них", "Кир", "Сон", "Вор", "Моор", "Стэв", "Дне"},
            {"ов", "гар", "'Даал", "кац", "'Та", "лав", "'Муур", "ки", "сан", "эст"},
            {" Беспощадный", " Кровавый", " Безумный", " Еретик", " Палач", " Сверепый", " Смертный",
                    " Последний палач Абаддона", " Проклятый", " Проводник"}};//имена врагов


    public Enemy(){
        this.name=Names[0][rnd.nextInt(10-0)+0]+Names[1][rnd.nextInt(10-0)+0]+Names[2][rnd.nextInt(10-0)+0];
        this.lvl= rnd.nextInt(5-1)+1;
        this.damage= rnd.nextInt(10-1)+1;
    }

    private String getLine(){
        String line = this.getName()+","+ this.getHp()+","+ this.getDamage()+","+this.getDexteritySkill()+","+
                this.getLvl()+","+this.xPos+","+this.yPos;
        return line;
    }

    public void addWeapon(){
        Random rnd = new Random();
        Weaponry mySword = new Weaponry("Месть архонта", 1, rnd.nextInt(50- 1)+1);
        this.Equipment.add(mySword);
    }
    public void display(){
        System.out.println(getLine());
    }

}
