package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

abstract class Alcohol implements AlcoholType {
    protected String name;
    protected int price;

    public Alcohol(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public abstract String getType();
}
