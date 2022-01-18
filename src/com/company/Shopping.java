package com.company;

import java.util.ArrayList;

public class Shopping {
    ArrayList<Item> items=new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public double getTotalCost(){
        double totalCost=0;
        for (Item item:items){
            if (item instanceof Countable){
                totalCost+=((Countable)item).getItemCost();

            }
            else if (item instanceof UnCountable){
                totalCost+=((UnCountable)item).getItemCost();

            }
        }
        return totalCost;
    }
    public void showItems(){
        Countable item1=null;
        UnCountable item2=null;
        for (Item item:items){
            if (item instanceof Countable){
                item1=(Countable)item;
                System.out.println(item1.getName()
                +"\t"+item1.getItemCost()/item1.getNumber()
                +"\t"+item1.getNumber()
                +"\t"+item1.getItemCost());
            }
            else if (item instanceof UnCountable){
                item2=(UnCountable)item;
                System.out.println(item2.getName()
                        +"\t"+item2.getItemCost()/item2.getWight()
                        +"\t"+item2.getWight()
                        +"\t"+item2.getItemCost());
            }
        }
    }
}
