package day15;
import java.util.LinkedList;
class MyMapNode {

    String key;
    int value;

    MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class uc1 {
	public static void main(String[] args) {

        String sentence = "To be or not to be";

        // Convert sentence to lowercase
        sentence = sentence.toLowerCase();

        // Split words
        String[] words = sentence.split(" ");

        // LinkedList of MyMapNode
        LinkedList<MyMapNode> list = new LinkedList<>();

        // Finding frequency
        for(String word : words)
        {
            boolean found = false;

            for(MyMapNode node : list)
            {
                if(node.key.equals(word))
                {
                    node.value++;
                    found = true;
                    break;
                }
            }

            // If word not present
            if(!found)
            {
                list.add(new MyMapNode(word, 1));
            }
        }

        // Display frequencies
        System.out.println("Word Frequencies:");

        for(MyMapNode node : list)
        {
            System.out.println(node.key + " : " + node.value);
        }
    }
}
