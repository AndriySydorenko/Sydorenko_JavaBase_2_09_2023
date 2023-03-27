package com.hillel.sydorenko.homeworks.homework17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    void testAvgNull(){
        int[] arrayNull = null;
        Assertions.assertEquals(-1, Main.arrayAvg(arrayNull));
    }
    @Test
    void testAvgEmpty(){
        int[] arrayEmpty = {};
        Assertions.assertEquals(-2, Main.arrayAvg(arrayEmpty));
    }
    @Test
    void testAvgGood(){
        int[] arrayGood = {1, 2, 3, 4};
        double average = Main.arrayAvg(arrayGood);
        Assertions.assertEquals(2.5, average);
    }

    @Test
    void testArrayMatrixGood() {
        int[][] arrayMatrixGood = {
                {1, 2},
                {3, 4}
                };
        Assertions.assertTrue(Main.isSquare(arrayMatrixGood));
    }

    @Test
    void testArrayMatrixBad() {
            int[][] arrayMatrixBad = {
                    {1, 2},
                    {3, 4},
                    {5, 6}
        };

        Assertions.assertFalse(Main.isSquare(arrayMatrixBad));
    }

    @Test
    void testArrayMatrixNull() {
        int[][] arrayMatrixNull = null;

        Assertions.assertFalse(Main.isSquare(arrayMatrixNull));
    }
    @Test
    void testArrayMatrixEmpty() {
        int[][] arrayMatrixEmpty = {};

        Assertions.assertFalse(Main.isSquare(arrayMatrixEmpty));
    }
}
