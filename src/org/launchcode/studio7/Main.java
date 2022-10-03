package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Renaissance", 12, "music CD");
        DVD myDVD = new DVD ("Spider Man 2", 5000, "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
myCD.readData();
myDVD.readData();

    }
}