package com.company;

public class UnCountable extends Item{
    private float wight;
    public UnCountable(float wight, String name, double price) {
        super(name, price);
        this.wight=wight;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }

    @Override
    public double getItemCost() {
        return wight*super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
