package com.hillel.sydorenko.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Androids phone1 = new Androids("123456", "Android v12.5");
        IPhones phone2 = new IPhones("7890123", "iOS v9");

        System.out.println("Phone 1: " + phone1.getModelName() + " phone, " + "on OS " + phone1.getOsVersion());
        phone1.getLinuxVersion();
        phone1.call();
        phone1.sms();
        phone1.internet();
        System.out.println();


        System.out.println("Phone 2: " + phone2.getModelName() + " phone, " + "on OS " + phone2.getOsVersion());
        phone2.getIOSVersion();
        phone2.call();
        phone2.sms();
        phone2.internet();

    }
}
