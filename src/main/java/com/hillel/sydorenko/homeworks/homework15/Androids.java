package com.hillel.sydorenko.homeworks.homework15;

public class Androids implements Smartphones, LinuxOS{
    private final String modelName = "Android";
    private String phoneNumber;
    private String osVersion;

    public Androids(String phoneNumber, String linuxVersion) {
        this.phoneNumber = phoneNumber;
        this.osVersion = linuxVersion;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public void call() {
        System.out.println("Phone" + " " + modelName + " " + "calling to " + phoneNumber);

    }

    @Override
    public void sms() {
        System.out.println("Phone" + " " + modelName + " " + "texting to " + phoneNumber);
    }

    @Override
    public void internet() {
        System.out.println("Phone" + " " + modelName + " " + "with system version " + osVersion + " connected to the internet");

    }

    @Override
    public void getLinuxVersion() {
        System.out.println("Phone" + " " + modelName + " " + "running " + osVersion);

    }
}
