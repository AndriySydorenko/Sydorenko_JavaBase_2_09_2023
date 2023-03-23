package com.hillel.sydorenko.homeworks.homework16;

public class DrinksCount {
    private static int coffeeCount = 0;
    private static int teaCount = 0;
    private static int lemonadeCount = 0;
    private static int mojitoCount = 0;
    private static int mineralCount = 0;
    private static int coceCount = 0;

    private static int totalDrinksCOunts = 0;
    private static double totalCosts = 0.0;

    public static int getTotalDrinksCOunts() {
        return totalDrinksCOunts;
    }

    public static double getTotalCosts() {
        return totalCosts;
    }

    static void makeCoffe() {
        System.out.println("Coffe making....");
    }

    static void makeLemonade() {
        System.out.println("Lemonade making....");
    }

    static void makeTea() {
        System.out.println("Tea making....");
    }

    static void makeMojito() {
        System.out.println("Mojito making....");
    }

    static void makeMineralWater() {
        System.out.println("Mineral Water making....");
    }

    static void makeCoceCola() {
        System.out.println("Coce-Cola making....");
    }

    // Додав в світч кейс і збільшення загальної кількості напоїв і збільшення кожного типу, якщо буде потрібно в майбутньому дізнатись кількість напоїв конкретного типу.
    public static void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFE:
//                makeCoffe();
                coffeeCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.coffePrice;
                break;

            case LEMONADE:
//                makeLemonade();
                lemonadeCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.limonadePrice;
                break;

            case TEA:
//                makeTea();
                teaCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.teaPrice;
                break;

            case MOJITO:
//                makeNojito();
                mojitoCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.mojitoPrice;
                break;

            case MINERALWATER:
//                makeMineralWater();
                mineralCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.mineralPrice;
                break;

            case COCECOLA:
//                makeCoceCola();
                coceCount++;
                totalDrinksCOunts++;
                totalCosts = totalCosts + Drinks.cocePrice;
                break;

        }
    }

}
