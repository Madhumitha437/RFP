package day12;

import java.util.Random;

class Node
{
    String card;
    Node next;

    Node(String card)
    {
        this.card = card;
        this.next = null;
    }
}

class CardQueue
{
    Node front = null;
    Node rear = null;

    void enqueue(String card)
    {
        Node n = new Node(card);

        if(front == null)
        {
            front = rear = n;
        }
        else
        {
            rear.next = n;
            rear = n;
        }
    }

    void display()
    {
        Node temp = front;

        while(temp != null)
        {
            System.out.println(temp.card);
            temp = temp.next;
        }
    }
}

class Player
{
    String name;
    CardQueue cards;

    Player(String name)
    {
        this.name = name;
        cards = new CardQueue();
    }
}

class PlayerNode
{
    Player player;
    PlayerNode next;

    PlayerNode(Player player)
    {
        this.player = player;
    }
}

class PlayerQueue
{
    PlayerNode front = null;
    PlayerNode rear = null;

    void enqueue(Player p)
    {
        PlayerNode n =
        new PlayerNode(p);

        if(front == null)
        {
            front = rear = n;
        }
        else
        {
            rear.next = n;
            rear = n;
        }
    }

    void display()
    {
        PlayerNode temp = front;

        while(temp != null)
        {
            System.out.println(
            "\n"+temp.player.name);

            temp.player.cards.display();

            temp = temp.next;
        }
    }
}

public class DeckQueue
{
    static int rankValue(String card)
    {
        if(card.startsWith("2")) return 2;
        if(card.startsWith("3")) return 3;
        if(card.startsWith("4")) return 4;
        if(card.startsWith("5")) return 5;
        if(card.startsWith("6")) return 6;
        if(card.startsWith("7")) return 7;
        if(card.startsWith("8")) return 8;
        if(card.startsWith("9")) return 9;
        if(card.startsWith("10")) return 10;
        if(card.startsWith("Jack")) return 11;
        if(card.startsWith("Queen")) return 12;
        if(card.startsWith("King")) return 13;

        return 14;
    }

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

        PlayerQueue pq =
        new PlayerQueue();

        int cardIndex = 0;

        for(int i=0;i<4;i++)
        {
            Player p =
            new Player("Player "+(i+1));

            String[] tempCards =
            new String[9];

            for(int j=0;j<9;j++)
            {
                tempCards[j] =
                deck[cardIndex];

                cardIndex++;
            }

            for(int a=0;a<9;a++)
            {
                for(int b=a+1;b<9;b++)
                {
                    if(rankValue(tempCards[a]) >
                       rankValue(tempCards[b]))
                    {
                        String temp =
                        tempCards[a];

                        tempCards[a] =
                        tempCards[b];

                        tempCards[b] = temp;
                    }
                }
            }

            for(int j=0;j<9;j++)
            {
                p.cards.enqueue(
                tempCards[j]);
            }

            pq.enqueue(p);
        }

        pq.display();
    }
}