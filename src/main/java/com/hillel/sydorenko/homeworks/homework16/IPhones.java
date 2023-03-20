package com.hillel.sydorenko.homeworks.homework16;

public class IPhones implements Smartphones, IOS{
    private final String modelName = "iOS";
    private String phoneNumber;
    private String osVersion;

    public IPhones(String phoneNumber, String iOSVersion) {
        this.phoneNumber = phoneNumber;
        this.osVersion = iOSVersion;
    }

    public String getModelName() {
        return modelName;
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

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

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
    public void getIOSVersion() {
        System.out.println("Phone" + " " + modelName + " " + "running " + osVersion);

    }
}
