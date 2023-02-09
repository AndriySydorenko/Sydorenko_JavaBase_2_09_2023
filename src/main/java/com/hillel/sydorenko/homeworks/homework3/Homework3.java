package com.hillel.sydorenko.homeworks.homework3;

public class Homework3 {
    public static void main(String[] args) {

        //DMS Lat: 50° 27' 0.0036'' N
        //DMS Long: 30° 31' 23.9988'' E

        int cifra50 = 50;
        int cifra27 = 26;
        float cifra0_0036 = 0.0036F;

        float cifra23_9988 ;
        cifra23_9988 = 23.9988F;
        int cifra30;
        cifra30 = 30;
        int cifra31;
        cifra31 = 31;

        char charGradys = '\u00B0';
        char charE = 'E';
        char charN = 'N';

        System.out.println("Kyiv coordinates:");
        System.out.println("DMS Lat: " + " " + cifra50 + charGradys + " " + cifra27 + "'" + " " + cifra0_0036 + "''" + " " + charN);
        System.out.println("DMS Long:: " + " " + cifra30 + charGradys + " " + cifra31 + "'" + " " + cifra23_9988 + "''" + " " + charE);


    }
    }

