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
        this.name=Names[0][rnd.nextInt(10)]+Names[1][rnd.nextInt(10)]+Names[2][rnd.nextInt(10)];
        this.lvl= rnd.nextInt(5-1)+1;
        this.damage= rnd.nextInt(10-1)+1;
    }
}
