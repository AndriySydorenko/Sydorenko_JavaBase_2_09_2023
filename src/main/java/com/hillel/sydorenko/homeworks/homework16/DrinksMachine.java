package com.hillel.sydorenko.homeworks.homework16;

public enum DrinksMachine {
    COFFE("Кава"),
    LEMONADE("Лимонад"),
    TEA("Чай"),
    MOJITO("Мохіто"),
    MINERALWATER("Мінеральна вода"),
    COCECOLA("Кока кола");

    private String drinkType;

    DrinksMachine(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }

}
