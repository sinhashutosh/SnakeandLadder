package org.example;

import java.util.Random;

public class SnakeandLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");
        int player_position = 0;
        System.out.println("Starting Position of Player = " + player_position);
        System.out.println("=========================================================\n");
        int dice = dice_roll();
        System.out.println(dice+" comes");
    }

    public static int dice_roll() {
        int dice;
        System.out.println("Please Roll the Dice");
        Random rd = new Random();
        dice = 1+rd.nextInt(6);
        return dice;
    }
}
