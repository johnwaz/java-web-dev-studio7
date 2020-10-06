package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int maxCapacity, int someUsedCapacity, String discType) {
        this.name = name;
        this.storageCapacity = maxCapacity;
        this.remainingCapacity = spaceLeft();
        this.capacityUsed = checkCapacity(someUsedCapacity);
        this.discType = discType;
    }

    private int checkCapacity(int dataWritten) {
        if (this.storageCapacity < dataWritten) {
            return this.storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return this.storageCapacity - this.capacityUsed;
    }

    public String discInfo() {
        return "\nDisc Name: " + this.name + "\nMax Capacity: " + this.storageCapacity + "\nSpace Used: " + this.capacityUsed + "\nAvailable Space: " + this.remainingCapacity;
    }

    public String writeData(int dataSize) {
        if (dataSize > this.remainingCapacity) {
            return "Not enough disc space!";
        }
        this.capacityUsed += dataSize;
        this.remainingCapacity -= dataSize;
        return "Data written to disc. Remaining space = " + this.remainingCapacity;
    }
}
