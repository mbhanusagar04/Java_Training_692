package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

class Beer extends Alcohol {
    public Beer(String name, int price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Beer";
    }
}

