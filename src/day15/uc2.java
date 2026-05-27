package day15;
import java.util.LinkedList;
import java.util.Iterator;
class MyMapNode3 {

    String key;
    int value;

    MyMapNode3(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class uc2 {

    // Size of Hash Table
    static final int SIZE = 10;

    public static void main(String[] args) {

        String paragraph =
        "Paranoids are not paranoid because they are paranoid " +
        "but because they keep putting themselves deliberately " +
        "into paranoid avoidable situations";

        // Convert to lowercase
        paragraph = paragraph.toLowerCase();

        // Split words
        String[] words = paragraph.split(" ");

        // Hash Table using LinkedList array
        LinkedList<MyMapNode3>[] table =
                new LinkedList[SIZE];

        // Create LinkedList for each index
        for(int i = 0; i < SIZE; i++)
        {
            table[i] = new LinkedList<>();
        }

        // Insert words into hash table
        for(String word : words)
        {
            // Generate hash index
            int index =
                    Math.abs(word.hashCode()) % SIZE;

            boolean found = false;

            // Search word in LinkedList
            for(MyMapNode3 node : table[index])
            {
                if(node.key.equals(word))
                {
                    node.value++;
                    found = true;
                    break;
                }
            }

            // If word not found
            if(!found)
            {
                table[index].add(
                        new MyMapNode3(word, 1));
            }
        }

        // Display frequencies
        System.out.println("Word Frequencies:\n");

        for(int i = 0; i < SIZE; i++)
        {
            if(!table[i].isEmpty())
            {
                System.out.println(
                        "Index " + i + ":");

                for(MyMapNode3 node : table[i])
                {
                    System.out.println(
                            node.key +
                            " -> " +
                            node.value);
                }

                System.out.println();
            }
        }
     // Remove "avoidable"
        String removeWord = "avoidable";

        int removeIndex =
                Math.abs(removeWord.hashCode()) % SIZE;

        Iterator<MyMapNode3> it =
                table[removeIndex].iterator();

        while(it.hasNext())
        {
            MyMapNode3 node = it.next();

            if(node.key.equals(removeWord))
            {
                it.remove();

                System.out.println(
                        "'avoidable' removed successfully\n");

                break;
            }
        }

        // Display After Removal
        System.out.println(
                "After Removing 'avoidable':\n");

        display(table);
    }

    // Display Method
    public static void display(
            LinkedList<MyMapNode3>[] table)
    {
        for(int i = 0; i < SIZE; i++)
        {
            if(!table[i].isEmpty())
            {
                System.out.println(
                        "Index " + i + ":");

                for(MyMapNode3 node : table[i])
                {
                    System.out.println(
                            node.key +
                            " -> " +
                            node.value);
                }

                System.out.println();
            }
        }
    }
}