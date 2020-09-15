package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private double storageCapacity;
    private double remainingStorage;
    private double usedSpace;
    private String name;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(double storageCapacity, double usedSpace, String name, String discType) {
        this.storageCapacity = storageCapacity;
        this.usedSpace = usedSpace;
        this.name = name;
        this.discType = discType;
        this.remainingStorage = spaceLeft();
    }

    public String writeData(double dataSize) {
        if (dataSize > this.remainingStorage) {
            return "Sorry, there is not enough space!";
        }
        this.usedSpace += dataSize;
        this.remainingStorage -= dataSize;
        return "Mission Accomplished! You now have " + this.remainingStorage + " space left.";
    }

    public double spaceLeft() {
        return this.storageCapacity - this.usedSpace;
    }

    public String discInfo() {
        return name + " is " + storageCapacity + " used " + usedSpace + " remaining " + remainingStorage;
    }
}
