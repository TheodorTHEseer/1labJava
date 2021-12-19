package Items;

import com.company.Named;

import java.util.Random;

public class Item implements Named {
    protected String name;
    protected int cost;
    protected int requiredLvl;


    Random rnd = new Random();
    //Конструктор
    public Item (){}
    public Item (String name, int requiredLvl){
        this.name = name;
        this.requiredLvl = requiredLvl;
        this.cost = requiredLvl*10* rnd.nextInt(100-1)+1;
    }
    //Getters
    public int getCost(){return cost;}

    //Setters
    public void setName(String name){this.name = name;}
    public void setCost(int cost){this.cost = cost;}
    public void setRequiredLvl(int requiredLvl){this.requiredLvl = requiredLvl;}
    @Override
    public String getName() {
        return this.name;
    }

}
