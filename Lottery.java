package com.kamilos;

import java.util.Scanner;

public class Lottery {
    String name;
    int range;
    int numberOfChoices;
    int range2;
    int numberOfChoices2;


    public Lottery(String name, int range, int numberOfChoices, int range2, int numberOfChoices2) {
        this.name = name;
        this.range = range;
        this.numberOfChoices = numberOfChoices;
        this.range2 = range2;
        this.numberOfChoices2 = numberOfChoices2;
    }

    public Lottery(String name, int range, int numberOfChoices, int numberOfChoices2) {
        this.name = name;
        this.range = range;
        this.numberOfChoices = numberOfChoices;
        this.numberOfChoices2 = numberOfChoices2;
    }

    public Lottery (String name, int range, int numberOfChoices) {
        this.name = name;
        this.range = range;
        this.numberOfChoices = numberOfChoices;



    }

    public Lottery() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getNumberOfChoices() {
        return numberOfChoices;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }

    public int getRange2() {
        return range2;
    }

    public void setRange2(int range2) {
        this.range2 = range2;
    }

    public int getNumberOfChoices2() {
        return numberOfChoices2;
    }

    public void setNumberOfChoices2(int numberOfChoices2) {
        this.numberOfChoices2 = numberOfChoices2;
    }
}


