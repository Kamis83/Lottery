package com.kamilos;

import java.util.InputMismatchException;
import java.util.Scanner;

class LotteryMake extends Lottery {

    Lottery lotteryMake() {
        Lottery lottery = new Lottery();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz nazwę loterii: ");
        String nameOfLottery = scan.nextLine();
        lottery.setName(nameOfLottery);
        this.name = nameOfLottery;

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Wpisz pierwszy zakres liczb: ");
        int range = scan2.nextInt();
        lottery.setRange(range);
        this.range = range;

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Wpisz ilość liczb do wylosowania z pierwszego zakresu lub ilosć liczb pierwszego losowania : ");
        int numberOfChoices = scan3.nextInt();
        lottery.setNumberOfChoices(numberOfChoices);
        this.numberOfChoices = numberOfChoices;

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Wpisz drugi zakres liczb: ");
        System.out.println("Jeśli nie chcesz ustawić zakresu  wpisz liczbe 0");

        int range1 = scan4.nextInt();

        while (range1 < 0) {
            System.out.println("Błędnie wybrany zakres wpisz ponownie!!!!");
            range1 = scan4.nextInt();
        }
        if (range1 > 0) {
            lottery.setRange2(range1);
            this.range2 = range1;
        } else {
            System.out.println("Brak drugiego zakresu z losowanymi liczbami loterii");
        }
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Wpisz ilość liczb do wylosowania z drugiego zakresu lub  ilość liczb drugiego losowania z pierwszego zakresu : ");
        int numberOfChoices1 = scan5.nextInt();
        while (numberOfChoices1 < 0) {
            System.out.println("Powtórz wybór: ");
            numberOfChoices1 = scan5.nextInt();
        }
        if (numberOfChoices1 > 0) {
            lottery.setNumberOfChoices2(numberOfChoices1);
            this.numberOfChoices2 = numberOfChoices1;
        } else{
            System.out.println("Brak drugiego zakresu z losowanymi liczbami loterii");
        }
        return lottery;
    }
}

//Scanner scan5 = new Scanner(System.in);
//if (range1 == 0) {
//  System.out.println("");
       /* } else {
            System.out.println("Wpisz ilość liczb do wylosowania z drugiego zakresu: ");
            int numberOfChoices1 = scan5.nextInt();
            lottery.setRange(numberOfChoices1);
            this.numberOfChoices2 = numberOfChoices1;
        }

        return lottery;
    }
}*/