package com.company;

public class Main {

    public static void main(String[] args) {
        Countable item1=new Countable(8,"egg",1.25f);
        Countable item2=new Countable(5,"cola",5.0f);
        UnCountable item3=new UnCountable(0.125f,"lunchon",64);
        Shopping shopping=new Shopping();
        shopping.addItem(item3);
        shopping.addItem(item2);
        shopping.addItem(item1);
        shopping.showItems();


    }
}
