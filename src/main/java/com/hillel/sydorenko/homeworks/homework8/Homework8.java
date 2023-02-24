package com.hillel.sydorenko.homeworks.homework8;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//
//                Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//        Виведіть у двох рядках вік гравців кожної команди.
//
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int team1AvgAge = 0;
        int team2AvgAge = 0;

        System.out.println("Team 1 players age:");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            System.out.print(team1[i] + " ");
            team1AvgAge = team1AvgAge + team1[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("Team 2 players age:");
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            System.out.print(team1[i] + " ");
            team2AvgAge = team2AvgAge + team2[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("Team 1 average age: " + Math.round(team1AvgAge / team1.length));
        System.out.println("Team 2 average age: " + Math.round(team2AvgAge / team2.length));

        }
    }

