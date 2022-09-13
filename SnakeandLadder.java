package org.example;

import java.util.Random;

public class SnakeandLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");
        //int counter = 0;
        int previous_position;
        int player_position = 0;
        int temp_position_ladder;
        int temp_position_snake;
        int dice;
        System.out.println("Starting Position of Player = " + player_position);
        System.out.println("=========================================================\n");
        while (player_position < 101) {
            dice = dice_roll();
            previous_position = player_position;
            //System.out.println("Previous Position " + previous_position);
            player_position += dice;
            player_position = checkposition(previous_position, player_position);
            /////////////////////////////////////////////////////
            System.out.println(dice + " comes");
            System.out.println("player position " + player_position);
            temp_position_ladder = ladder(player_position);
            System.out.println("temp position ladder = " + temp_position_ladder);
            if (temp_position_ladder != 0) {
                player_position = temp_position_ladder;
            }
            temp_position_snake = snake(player_position);
            System.out.println("temp position snake =" + temp_position_snake);
            if (temp_position_snake != 0) {
                player_position = temp_position_snake;
            }
            //counter++;
            //System.out.println("Counter =" + counter);
            /////////////////
            result(player_position);
        }
        System.out.println("=========================================================\n");
    }

    public static int dice_roll() {
        int dice;
        System.out.println("Please Roll the Dice");
        Random rd = new Random();
        dice = 1 + rd.nextInt(6);
        return dice;
    }

    public static int snake(int s) {
        int ch = s;
        int snakebite = 0;
        switch (ch) {
            case 59:
                snakebite = 19;
                System.out.println("Oh No..... Face Snake...");
                break;
            case 62:
                snakebite = 38;
                System.out.println("Oh No..... Face Snake...");
                break;
            case 70:
                snakebite = 47;
                System.out.println("Oh No..... Face Snake...");
                break;
            case 91:
                snakebite = 64;
                System.out.println("Oh No..... Face Snake...");
                break;
            case 99:
                snakebite = 5;
                System.out.println("Oh No..... Face Snake...");
                break;
        }
        return snakebite;

    }

    public static int ladder(int l) {
        int ch = l;
        int ladder = 0;
        switch (ch) {
            case 3:
                ladder = 22;
                System.out.println("Hurray...you got ladder");
                break;
            case 9:
                ladder = 34;
                System.out.println("Hurray...you got ladder");
                break;
            case 11:
                ladder = 49;
                System.out.println("Hurray...you got ladder");
                break;
            case 17:
                ladder = 90;
                System.out.println("Hurray...you got ladder");
                break;
            case 24:
                ladder = 94;
                System.out.println("Hurray...you got ladder");
                break;
            case 39:
                ladder = 96;
                System.out.println("Hurray...you got ladder");
                break;
            case 63:
                ladder = 81;
                System.out.println("Hurray...you got ladder");
                break;
        }
        return ladder;
    }

    static int checkposition(int a, int b) {
        int position = a;
        int playerposition = b;
        if (playerposition > 100) {
            playerposition = position;
            System.out.println("its working " + playerposition);
        }
        return playerposition;
    }

    static void result(int a) {
        int b = a;
        if (b == 100) {
            System.out.println("=========================================================\n");
            System.out.println("Finally You Won...");
            System.exit(0);
        }
    }
}
