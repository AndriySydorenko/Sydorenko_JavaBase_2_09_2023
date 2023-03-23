package com.hillel.sydorenko.homeworks.homework16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runMachine();
    }

    static void runMachine() {
        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] drinksType = DrinksMachine.values();
        DrinksMachine userDrinkType = null;

        while (true) {
            boolean isStop = false;
            while (true) {
                System.out.println("Please insert item from list: " + Arrays.toString(drinksType));
                System.out.println("Total drinks makes: " + DrinksCount.getTotalDrinksCOunts());
                System.out.println("Total money spends: " + DrinksCount.getTotalCosts());
                System.out.println("For stoping program insert STOP ");
                String userChose = scanner.nextLine();

                if (userChose.toUpperCase().equals("STOP")) {
                    isStop = true;
                    break;
                }

                userChose = userChose.toUpperCase();
                for (DrinksMachine value : drinksType) {
                    if (userChose.equals(value.toString())) {
                        userDrinkType = DrinksMachine.valueOf(userChose);
                        break;
                    } else {
                        userDrinkType = null;
                    }
                }

                if (userDrinkType != null) {
                    break;
                } else {
                    System.out.println("Wrong data, try again");
                }
            }

            if (isStop) {
                break;
            }

                switch (userDrinkType) {
                    case COFFE: {
                        System.out.println("You chose: " + DrinksMachine.COFFE.getDrinkType());
                        System.out.println("Price: " + Drinks.coffePrice);
                        DrinksCount.makeCoffe();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }

                    case LEMONADE: {
                        System.out.println("You chose: " + DrinksMachine.LEMONADE.getDrinkType());
                        System.out.println("Price: " + Drinks.limonadePrice);
                        DrinksCount.makeLemonade();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }

                    case TEA: {
                        System.out.println("You chose: " + DrinksMachine.TEA.getDrinkType());
                        System.out.println("Price: " + Drinks.teaPrice);
                        DrinksCount.makeTea();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }

                    case MOJITO: {
                        System.out.println("You chose: " + DrinksMachine.MOJITO.getDrinkType());
                        System.out.println("Price: " + Drinks.mojitoPrice);
                        DrinksCount.makeMojito();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }

                    case MINERALWATER: {
                        System.out.println("You chose: " + DrinksMachine.MINERALWATER.getDrinkType());
                        System.out.println("Price: " + Drinks.mineralPrice);
                        DrinksCount.makeMineralWater();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }

                    case COCECOLA: {
                        System.out.println("You chose: " + DrinksMachine.COCECOLA.getDrinkType());
                        System.out.println("Price: " + Drinks.cocePrice);
                        DrinksCount.makeCoceCola();
                        DrinksCount.makeDrink(userDrinkType);
                        break;
                    }
                }

        }

    }
}


