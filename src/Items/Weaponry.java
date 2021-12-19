package Items;

import java.util.Random;

public class Weaponry extends Item{
    Random rnd = new Random();
    private int weaponDmg;
    private String rare;

    //Getters
    public int getWeaponDmg(){return weaponDmg;}
    public String getRare() {return rare;}
    //Setters
    public void setWeaponDmg(int weaponDmg){this.weaponDmg=weaponDmg;}
    static String[][] Tags = {{"Стальной", "Железный", "Медный", "Бронзовый"},
            {"одноручный меч", "топор", "кинжал", "полуторный меч"}};


    //Конструктор
    public Weaponry (String name, int requiredLvl,
                     int weaponDmg){
        super(name, requiredLvl);
        this.weaponDmg = weaponDmg;
        this.rare = "обычный";
        this.cost=(weaponDmg+rnd.nextInt(20-5)+5)*requiredLvl;
        if (weaponDmg >= 100 && requiredLvl >= 10){this.rare = "редкий";}
        if (weaponDmg >= 200 && requiredLvl >= 20){this.rare = "очень редкий";}
        if (weaponDmg >= 1000){this.rare = "легендарный";}
    }
    public Weaponry (){
        this.name=Tags[0][rnd.nextInt(3)]+" "+ Tags[1][rnd.nextInt(3)];
        this.requiredLvl=rnd.nextInt(5-1)+1;
        this.weaponDmg=requiredLvl*10;
        this.cost=weaponDmg*15;
    }
}
