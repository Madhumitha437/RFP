package day16;

import java.util.Scanner;

public class linear2 {

    // Method to search sentence containing word
    public static String search(String[] sentences,
                                String word)
    {
        // Traverse all sentences
        for(int i = 0; i < sentences.length; i++)
        {
            // Check if sentence contains word
            if(sentences[i].contains(word))
            {
                return sentences[i];
            }
        }

        // Word not found
        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.println(
                "Enter number of sentences:");

        int n = c.nextInt();
        c.nextLine();

        String[] sentences = new String[n];

        // Input sentences
        System.out.println(
                "Enter the sentences:");

        for(int i = 0; i < n; i++)
        {
            sentences[i] = c.nextLine();
        }

        // Input search word
        System.out.println(
                "Enter word to search:");

        String word = c.nextLine();

        // Search operation
        String result =
                search(sentences, word);

        System.out.println(
                "Result: " + result);
        c.close();
    }
}