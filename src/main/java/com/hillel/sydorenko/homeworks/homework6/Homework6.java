package com.hillel.sydorenko.homeworks.homework6;

public class Homework6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; count < 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14 || i / 10 == 90) {
                continue;
            }
                System.out.println("Shuttle number = " + i);
                count++;
            }
        System.out.println("Shuttle count = " + count);






        // Також спробував зробити з циклом while

//        int i = 0;
//        while (count < 100) {
//            i++;
//            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14 || i / 10 == 90) {
//                continue;
//            }
//            System.out.println("Shuttle number = " + i);
//            count++;
//        }
//        System.out.println("Shuttle count = " + count);
    }

}

