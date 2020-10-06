package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD example", 700, 350, "CD-R");
        DVD dvd = new DVD("DVD example", 4700, 1450, "DVD-R");

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.discInfo());
        System.out.println(dvd.discInfo());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
