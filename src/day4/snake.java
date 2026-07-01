package day4;

import java.util.*;

public class snake {

    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        int player1Position = 0;
        int player2Position = 0;

        int diceCount = 0;

        Random random = new Random();

        while (player1Position < WINNING_POSITION &&
               player2Position < WINNING_POSITION) {

            // ---------------- PLAYER 1 ----------------
            System.out.println("\nPLAYER 1 TURN");

            player1Position = playTurn(player1Position, random);

            diceCount++;

            System.out.println("Player 1 Position : " + player1Position);

            if (player1Position == WINNING_POSITION) {
                System.out.println("\nPLAYER 1 WON THE GAME");
                break;
            }

            // ---------------- PLAYER 2 ----------------
            System.out.println("\nPLAYER 2 TURN");

            player2Position = playTurn(player2Position, random);

            diceCount++;

            System.out.println("Player 2 Position : " + player2Position);

            if (player2Position == WINNING_POSITION) {
                System.out.println("\nPLAYER 2 WON THE GAME");
                break;
            }
        }

        System.out.println("\nTotal Dice Rolled : " + diceCount);
    }

    static int playTurn(int position, Random random) {

        boolean playAgain = true;

        while (playAgain) {

            playAgain = false;

            // UC2 -> Dice Roll (1 to 6)
            int die = random.nextInt(6) + 1;

            // UC3 -> Option
            int option = random.nextInt(3);

            System.out.println("Dice Number : " + die);

            switch (option) {

                // No Play
                case 0:
                    System.out.println("No Play");
                    break;

                // Ladder
                case 1:
                    System.out.println("Ladder");
                    position += die;

                    // UC5 -> Exact 100 condition
                    if (position > 100) {
                        position -= die;
                    }
                    else {
                        // UC7 -> Player gets another chance
                        playAgain = true;
                    }

                    break;

                // Snake
                case 2:
                    System.out.println("Snake");
                    position -= die;

                    // UC4 -> If below 0 reset to 0
                    if (position < 0) {
                        position = 0;
                    }

                    break;
            }

            System.out.println("Current Position : " + position);
        }

        return position;
    }
}