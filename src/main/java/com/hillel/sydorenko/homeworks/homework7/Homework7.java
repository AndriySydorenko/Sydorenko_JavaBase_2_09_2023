package com.hillel.sydorenko.homeworks.homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int secretNumber;
        int userNumber;
        int numberGuesses = 0;
        int maxGuesses = 4;

        secretNumber = (int) (Math.random() * 11);

        Scanner scanner = new Scanner(System.in);

        System.out.println("AI selected a number between 0 and 10, attempt to guess this number!");
        System.out.println("You have only" + " " + maxGuesses + " " + "attempts!");

        while (numberGuesses < maxGuesses) {
            numberGuesses++;
            System.out.println("Attempts number " + numberGuesses + ":");
            userNumber = scanner.nextInt();
//          scanner.nextLine(); // тут можемо додати очистку буфера якщо в подальшому ще будемо використовувати сканер

            if (userNumber == secretNumber) {
                System.out.println("Congratulation! You Win!");
                System.out.println("Your number: " + userNumber);
                System.out.println("AI number: " + secretNumber);
                break;
            } else if (userNumber < secretNumber) {
                System.out.println("AI chose bigger number.");
            } else {
                System.out.println("AI chose less number.");
            }
            if (numberGuesses == maxGuesses) {
                System.out.println("Sorry, you a not guess.");
                System.out.println("AI guess number: " + secretNumber);
            }
        }
        scanner.close();

//
//        int secretNumber;
//        int userNumber;
//        int numberGuesses = 0;
//        int maxGuesses = 3;
//        boolean correct = false;
//
//        secretNumber = (int) (Math.random() * 11);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("AI selected a number between 0 and 10, attempt to guess this number!");
//        System.out.println("You have only" + " " + maxGuesses + " " + "attempts!");
//
//        while (numberGuesses < maxGuesses) {
//            numberGuesses++;
//            System.out.println("Attempts number " + numberGuesses + ":");
//            userNumber = scanner.nextInt();
//
//            if (userNumber == secretNumber) {
//                System.out.println("Congratulation! You Win!");
//                System.out.println("Your number: " + userNumber);
//                System.out.println("AI number: " + secretNumber);
//                correct = true;
//                break;
//            } else if (userNumber < secretNumber) {
//                System.out.println("AI chose bigger number.");
//            } else {
//                System.out.println("AI chose less number.");
//            }
//        }
//
//            if (!correct) {
//                System.out.println("Sorry, you a not guess.");
//                System.out.println("AI guess number: " + secretNumber);
//            }
//        scanner.close();


    }
}
