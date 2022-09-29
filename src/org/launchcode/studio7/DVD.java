package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int capacity, String discType){
        super(name, capacity, discType);

    }
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    };

    @Override
    public void readData(){
        System.out.println("DVD is now playing");
    }

    @Override
    public void storeData(){
        System.out.println("DVD data is stored");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
