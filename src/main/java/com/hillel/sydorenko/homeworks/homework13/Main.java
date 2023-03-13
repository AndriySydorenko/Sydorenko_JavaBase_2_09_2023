package com.hillel.sydorenko.homeworks.homework13;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Misha", "mail1@gmail.com", 1995, 13, 12, 112333312, "Dimetrov", 100, 123, 12345);
        Person person2 = new Person("Dima", "mail1@gmail.com", 1988, 22, 3, 112333312, "Inatenko", 75, 123, 12345);
        Person person3 = new Person("Kiril", "mail1@gmail.com", 1991, 30, 2, 112333312, "Kimenko", 88, 123, 12345);
        Person person4 = new Person("Olya", "mail1@gmail.com", 2000, 6, 8, 112333312, "Onyfrionko", 50, 123, 12345);
        person1.printAccountInfo();
        person2.printAccountInfo();
        person3.printAccountInfo();
        person4.printAccountInfo();

    }
}
