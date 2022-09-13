package org.example;

import java.util.Random;
import java.util.Scanner;

public class SnakeandLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1_position = 0;
        int player2_position = 0;
        int temp_position_ladder1 = 0;
        int temp_position_snake1 = 0;
        int temp_position_snake2 = 0;
        int temp_position_ladder2 = 0;
        int count1 = 0;
        int count2 = 0;
        int previous_First_PLayer_position;
        int previous_Second_PLayer_position;
        System.out.println("****************************************************************************************");
        System.out.println("Welcome to the Snake and Ladder Game");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter the First Player Name ...");
        String FirstPlayerName = sc.nextLine();
        System.out.println("Enter the Second Player Name ...");
        String SecondPlayerName = sc.nextLine();
        System.out.println("****************************************************************************************");
        System.out.println("Starting Position of " + FirstPlayerName + " = " + player1_position);
        System.out.println("Starting Position of " + SecondPlayerName + " = " + player2_position);
        Random rd = new Random();
        // int toss = rd.nextInt(2);
        /*if (toss == 0) {
            System.out.println(FirstPlayerName + " will roll Dice first");
            player1_position += dice_roll();
        } else {
            System.out.println(SecondPlayerName + " will roll Dice first");
            player2_position = dice_roll();
        }
        if (player1_position != 0) {
            player2_position += dice_roll();
        } else {
            player1_position += dice_roll();
        }*/
        //*********************************************************************************************************\
        while (player1_position < 101 && player2_position < 101) {
            if (player1_position != 100) {
                previous_First_PLayer_position = player1_position;
                System.out.println("Player one position " + player1_position);
                player1_position += dice_roll();
                int i = result(player1_position);
                if (i == 1) {
                    System.out.println(FirstPlayerName + " won....");
                    System.out.println(SecondPlayerName + " loss....");
                    System.exit(0);
                }
                player1_position = checkposition(previous_First_PLayer_position, player1_position);
                temp_position_ladder1 = ladder(player1_position);
                //System.out.println("temp position ladder = " + temp_position_ladder1);
                if (temp_position_ladder1 != 0) {
                    player1_position = temp_position_ladder1;
                }
                temp_position_snake1 = snake(player1_position);
                // System.out.println("temp position snake =" + temp_position_snake1);
                if (temp_position_snake1 != 0) {
                    player1_position = temp_position_snake1;
                }
                //*********************************************************************************************************\
                count1++;
                System.out.println("Count == " + count1);
            }
            if (player2_position != 100) {
                previous_Second_PLayer_position = player2_position;
                System.out.println("Player Two Position " + player2_position);
                player2_position += dice_roll();
                int j = result(player2_position);
                if (j == 1) {
                    System.out.println(SecondPlayerName + " won....");
                    System.out.println(FirstPlayerName + " loss....");
                    System.exit(0);
                }
                player2_position = checkposition(previous_Second_PLayer_position, player2_position);
                temp_position_ladder2 = ladder(player2_position);
                //  System.out.println("temp position ladder = " + temp_position_ladder2);
                if (temp_position_ladder2 != 0) {
                    player2_position = temp_position_ladder2;
                }
                temp_position_snake2 = snake(player2_position);
                // System.out.println("temp position snake =" + temp_position_snake2);
                if (temp_position_snake2 != 0) {
                    player2_position = temp_position_snake2;
                }
                count2++;
                System.out.println("Count == " + count2);
            }


        }
    }

    public static int dice_roll() {
        int dice;
        System.out.println("Please Roll the Dice");
        Random rd = new Random();
        dice = 1 + rd.nextInt(6);
        System.out.println("dice == " + dice);
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

    static int result(int a) {
        int x = a;
        int flag = 0;
        if (x == 100) {
            System.out.println("=========================================================\n");
            flag = 1;
            //  System.exit(0);
        }
        return flag;
    }


}



