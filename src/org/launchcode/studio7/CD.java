package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, int capacity, String discType) {
        super(name, capacity, discType);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("CD is now playing");
    }

    @Override
    public void storeData() {
        System.out.println("CD data is stored");

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.

    }
}