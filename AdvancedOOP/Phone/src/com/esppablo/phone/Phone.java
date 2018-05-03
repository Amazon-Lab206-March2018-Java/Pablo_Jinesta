package com.esppablo.phone;

// Create a Phone abstract class.

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    
    // getters and setters 
    public void SetVersionNumber(String versionNumber) {
    	this.versionNumber = versionNumber;
    }
    public String getVersionNumber() {
    	return versionNumber;
    }
    
    public void setBatteryPercentagee(int batteryPercentage) {
    	this.batteryPercentage = batteryPercentage;
    }
    public int getBatteryPercentage() {
    	return batteryPercentage;
    }
    
    public void SetCarrier(String carrier) {
    	this.carrier = carrier;
    }
    public String getCarrier() {
    	return carrier;
    }
    
    public void SetRingTone(String ringTone) {
    	this.ringTone = ringTone;
    }
    public String getRingTone() {
    	return ringTone;
    }
    
}