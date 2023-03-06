package com.hillel.sydorenko.homeworks.homework11;

public class Person {
    static String personInfo(String name, String surname, String city, String phoneNumber) {
        return "Зателефонувати громадянинові " + name + " " + surname + " з міста " + city + " можна за номером " + phoneNumber + ".";
    }

    public static void main(String[] args) {
        String person1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String person2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String person3 = personInfo("Sherlock", "Holmes", "London", "37742123513");
        String person4 = personInfo("Andrii", "Sydorenko", "Kyiv", "09312345678");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
