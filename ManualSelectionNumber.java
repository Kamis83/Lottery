package com.kamilos;

import java.util.Arrays;
import java.util.Scanner;

public class ManualSelectionNumber extends AbstractNumberSelection {
    Scanner scan = new Scanner(System.in);

    @Override
    protected int selectNumber(int range) {
        int h = scan.nextInt();

        while (isOutOfRange(h, range)){
            System.out.println("Wybór spoza zakresu" );
            System.out.println(" Wybierz ponownie: ");
            return scan.nextInt();

        } return h;
    }


    private boolean isOutOfRange(int h, int range) {
        return h <= 0 || h > range;

    }
}