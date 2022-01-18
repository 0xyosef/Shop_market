package com.company;

public class Countable extends Item{
    private int number;


    public Countable(int number,String name, double price) {
        super(name, price);
        this.number=number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public double getItemCost() {
        return number*super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
