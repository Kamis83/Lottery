package com.kamilos;

import java.util.Random;

public class RandomSelectionNumber extends AbstractNumberSelection{

    private final Random random = new Random();
    private final Random lotteryDraw = new Random();



    protected int selectNumber(int range) {
        return random.nextInt(range) + 1;
    }
}


