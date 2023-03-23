package com.hillel.sydorenko.homeworks.homework16;

public enum DrinksMachine {
    COFFE("Coffe"),
    LEMONADE("Lemonade"),
    TEA("Tea"),
    MOJITO("Mojito"),
    MINERALWATER("Mineral water"),
    COCECOLA("Coce-cola");

    private String drinkType;

    DrinksMachine(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }

}
