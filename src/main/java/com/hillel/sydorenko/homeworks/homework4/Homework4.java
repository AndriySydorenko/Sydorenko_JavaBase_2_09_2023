package com.hillel.sydorenko.homeworks.homework4;

public class Homework4 {
    public static void main(String[] args) {
//        За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
//
//                З кожного боку боролися 3 типи воїнів з такими показниками атаки:
//
//        Лі:
//
//        воїн - 13
//        лучник - 24
//        вершник - 46
//
//
//        Мінь:
//
//        воїн - 9
//        лучник - 35
//        вершник - 12
//        Розрахувати: загальний показник атаки для обох династій, якщо відомо, що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь кожного типу в півтора рази більша.
//
//        Вивести в консоль значення загальної атаки кожної армії;

        int warriorLi = 13;
        int countWarriorLi = 860;
        int rangerLi = 24;
        int countRangerLi = 860;
        int cavalryLi = 46;
        int countCavalryLi = 860;

        int warriorMin = 9;
        double countWarriorMin = countWarriorLi * 1.5;
        int rangerMin = 35;
        double countRangerMin = countRangerLi * 1.5;
        int cavalryMin = 12;
        double countcavalryMin = countCavalryLi * 1.5;

        int powerWarrirLi = warriorLi * countWarriorLi;
        int powerRangerLi = rangerLi * countRangerLi;
        int powerCavalryLi = cavalryLi * countCavalryLi;

        double powerWarriorMin = warriorMin * countWarriorMin;
        double powerRangerMin = rangerMin * countRangerMin;
        double powerCavalryMin = cavalryMin * countcavalryMin;

        int totalLiPower = powerWarrirLi + powerRangerLi + powerCavalryLi;
        double totalMinPower = powerWarriorMin + powerRangerMin + powerCavalryMin;

        System.out.println("Total Li army power = " + totalLiPower);
        System.out.println("Total Min army power = " + (int) totalMinPower);













    }
}
