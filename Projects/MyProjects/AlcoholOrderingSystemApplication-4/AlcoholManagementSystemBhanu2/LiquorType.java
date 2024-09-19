package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

enum LiquorType {
    WHISKY("Whisky", 500),
    VODKA("Vodka", 450),
    RUM("Rum", 400);

    private final String name;
    private final int price;

    LiquorType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Liquor getLiquor() {
        return new Liquor(name, price);
    }
}


