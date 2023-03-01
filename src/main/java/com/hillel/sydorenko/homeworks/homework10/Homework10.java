package com.hillel.sydorenko.homeworks.homework10;

import java.util.Arrays;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі. Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter M:");
        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
        }
        System.out.println("Please enter N:");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
        }
        scanner.close();
// створюємо масиви
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];
// заповнюємо перший масив, я ввзяв максимальте число 9 для того що б масив було легче читати в консолі
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }
        }
// виводимо масив 1
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


//  транспонуємо масив 1 в масив2
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = array1[j][i];
            }

        }
// виводимо масив 2
        System.out.println("Arrey 2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

//        Також масив можна вивести з задопомогою команди, але читати його важче буде
//        System.out.println("Array 1: ");
//        System.out.println(Arrays.deepToString(array1));
//        System.out.println();
//        System.out.println("Array 2: ");
//        System.out.println(Arrays.deepToString(array2));
    }
}
