package com.hillel.sydorenko.homeworks.homework4;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {

        // Будемо вважати що ми знаємо тільки те що кількість воїнів династії Мінь кожного типу в півтора рази більша, решту будемо вводити через консоль.

        Scanner qwerty = new Scanner(System.in);
        System.out.println("Enter count of Warriors in Li army:");
        int countWarriorLi = qwerty.nextInt();

        System.out.println("Enter power of each warrior unit in Li army:");
        int powerWarriorLi = qwerty.nextInt();

        System.out.println("Enter count of Rangers in Li army:");
        int countRangerLi = qwerty.nextInt();

        System.out.println("Enter power of each Ranger unit in Li army:");
        int powerRangerLi = qwerty.nextInt();

        System.out.println("Enter count of Cavalries in Li army:");
        int countCavalryrLi = qwerty.nextInt();

        System.out.println("Enter power of each Cavalry unit in Li army:");
        int powerCavalryLi = qwerty.nextInt();


        int tottaLiWarriorsPower = countWarriorLi * powerWarriorLi;
        int tottalLiRangersPower = countRangerLi * powerRangerLi;
        int totalLiCavalryPower = countCavalryrLi * powerCavalryLi;

        System.out.println("Enter power of each warrior unit in Min army:");
        int powerWarriorMin = qwerty.nextInt();
        double countWarriorMin = countWarriorLi * 1.5;

        System.out.println("Enter power of each Ranger unit in Min army:");
        int powerRangerMin = qwerty.nextInt();
        double countRangerMin = countRangerLi * 1.5;

        System.out.println("Enter power of each Cavalry unit in Min army:");
        int powerCavalryMin = qwerty.nextInt();
        double countCavalryrMin = countCavalryrLi * 1.5;

        double tottaMinWarriorsPower = countWarriorMin * powerWarriorMin;
        double tottalMinRangersPower = countRangerMin * powerRangerMin;
        double totalMinCavalryPower = countCavalryrMin * powerCavalryMin;

        int totalLiPower = tottaLiWarriorsPower + tottalLiRangersPower + totalLiCavalryPower;
        double totalMinPower = tottaMinWarriorsPower + tottalMinRangersPower + totalMinCavalryPower;

        System.out.println("Total Li army power = " + totalLiPower);
        System.out.println("Total Min army power = " + (int) totalMinPower);

    }
}
