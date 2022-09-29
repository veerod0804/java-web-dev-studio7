package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int capacity;
//    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, int capacity, String discType){
        this.name = name;
        this.capacity = capacity;
//        this.contents = contents;
        this.discType = discType;


    }
}