package com.hillel.sydorenko.homeworks.homework17;

public class Main {
    //    Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
//    Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
//    В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу
    public static double arrayAvg(int[] array) {
        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static boolean isSquare(int[][] matrix){
        if(matrix == null){
            return false;
        }
        if(matrix.length == 0){
            return false;
        }

        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != rows) {
                return false;
            }
        }
        return true;
    }
}
