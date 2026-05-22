package day12;

import java.util.Random;

public class DeckOfCards
{
    public static void main(String[] args)
    {
        String[] suits =
        {
            "Clubs",
            "Diamonds",
            "Hearts",
            "Spades"
        };

        String[] ranks =
        {
            "2","3","4","5","6","7","8",
            "9","10","Jack","Queen",
            "King","Ace"
        };

        String[] deck = new String[52];

        int k = 0;

        for(int i=0;i<suits.length;i++)
        {
            for(int j=0;j<ranks.length;j++)
            {
                deck[k] =
                ranks[j]+" of "+suits[i];

                k++;
            }
        }

        Random r = new Random();

        for(int i=0;i<52;i++)
        {
            int random = r.nextInt(52);

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        String[][] players = new String[4][9];

        int card = 0;

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<9;j++)
            {
                players[i][j] = deck[card];
                card++;
            }
        }

        for(int i=0;i<4;i++)
        {
            System.out.println(
            "\nPlayer "+(i+1));

            for(int j=0;j<9;j++)
            {
                System.out.println(
                players[i][j]);
            }
        }
    }
}