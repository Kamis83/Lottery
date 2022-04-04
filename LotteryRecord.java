package com.kamilos;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LotteryRecord extends LotteryMake {

    int numberOfLottery() {
        System.out.println("Podaj liczbę loterii jakie chcesz wprowadzić");
        Scanner scan = new Scanner(System.in);
        int numberOfLottery = scan.nextInt();

        try {
            numberOfLottery = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("NIeprawidłowy format");
        }

        while (numberOfLottery <= 0) {
            System.out.println("Liczba niedozwolona proszę o ponowne wprowadzenie liczby loterii!!!");
            numberOfLottery = scan.nextInt();
        }
        return numberOfLottery;
    }

    void lotteryRecord() {
        int number = numberOfLottery();
        List<Lottery> lotteryList = new ArrayList<>();

        for (int i = 0; i < number; i++) {

            Lottery create = lotteryMake();
            lotteryList.add(create);
            System.out.println(lotteryList.get(i).getName());

        }
       /* System.out.println(lotteryList.get(0).name);
        System.out.println(lotteryList.get(0).range);
        System.out.println(lotteryList.get(0).numberOfChoices);
        System.out.println(lotteryList.get(0).range2);
        System.out.println(lotteryList.get(0).numberOfChoices2);*/
    }
}
