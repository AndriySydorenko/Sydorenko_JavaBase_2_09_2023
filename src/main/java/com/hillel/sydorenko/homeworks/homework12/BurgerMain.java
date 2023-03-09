package com.hillel.sydorenko.homeworks.homework12;

public class BurgerMain {
    public static void main(String[] args) {
        Burger def = new Burger("White bread", "beef", "salat", "one slice of cheadar", "mayo");
        Burger diet = new Burger("White bread with cereals", "beef", "salat", "one slice of cheadar");
        Burger doubleBurger = new Burger("with mayo", "White bread", "beef", 2, "salat", "cheadar");
    }

}
