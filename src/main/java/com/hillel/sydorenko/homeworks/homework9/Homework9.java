package com.hillel.sydorenko.homeworks.homework9;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//                Другий масив - це числа, які вгадав гравець.
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//                У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//[0, 1, 4, 5, 5, 8, 9]
//
//[1, 1, 2, 3, 5, 6, 9]
//        Кількість збігів: 3
        int arrayLenght = 7;
        int[] array1 = new int[arrayLenght];
        int[] array2 = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);

        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Сортування циклом
//        for (int i = 0; i < arrayLenght; i++) {
//            for (int j = 0; j < arrayLenght - 1 - i; j++) {
//                if (array1[j] > array1[j + 1]) {
//                    int temp = array1[j];
//                    array1[j] = array1[j + 1];
//                    array1[j + 1] = temp;
//                }
//                if (array2[j] > array2[j + 1]) {
//                    int temp2 = array2[j];
//                    array2[j] = array2[j + 1];
//                    array2[j + 1] = temp2;
//                }
//            }
//
//        }

        System.out.println("Lottery numbers:");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println("User numbers:");
        System.out.println(Arrays.toString(array2));

        int match = 0;
        for (int i = 0; i < arrayLenght; i++) {
            if (array1[i] == array2[i]) {
                match++;
            }

        }
        System.out.println("Matches: " + match);


    }
}
