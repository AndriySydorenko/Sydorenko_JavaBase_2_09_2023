package com.hillel.sydorenko.homeworks.homework12;

public class Burger {
    String mayo;
    String bread;
    String meat;
    int meatCount;
    String vegetables;
    String cheese;

    public Burger(String bread, String meat, String vegetables, String cheese, String mayo) {
        this.mayo = mayo;
        this.bread = bread;
        this.meat = meat;
        this.vegetables = vegetables;
        this.cheese = cheese;
        System.out.println("Standard burger includes: " + bread + ", " + meat + ", " + vegetables + ", " + mayo + ", " + cheese);
    }

    public Burger(String bread, String meat, String vegetables, String cheese) {
        this.bread = bread;
        this.meat = meat;
        this.vegetables = vegetables;
        this.cheese = cheese;
        System.out.println("Diet burger includes: " + bread + ", " + meat + ", " + vegetables + ", " + cheese + ", " + "without mayo");
    }

    public Burger(String mayo, String bread, String meat, int meatCount, String vegetables, String cheese) {
        this.mayo = mayo;
        this.bread = bread;
        this.meat = meat;
        this.meatCount = meatCount;
        this.vegetables = vegetables;
        this.cheese = cheese;
        System.out.println("Double Burger includes: " + bread + ", " + meatCount + " " + "pieces of " + meat + ", " + mayo + ", " + vegetables + ", " + cheese);
    }
}
