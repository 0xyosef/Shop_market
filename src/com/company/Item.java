package com.company;

public class Item {
    private String name;
    private double price;


    public Item(String name, double price ) {
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getItemCost(){
        return 1.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
