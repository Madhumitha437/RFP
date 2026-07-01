package practicecollection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class hashmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]= {"apple","ant","ball"};
		HashMap<Character,List<String>> a= new HashMap<>();
		for(String word:words) {
			char key= word.charAt(0);
			a.putIfAbsent(key, new ArrayList<>());
			a.get(key).add(word);
		}
		System.out.println(a);
		int arr[]= {10,5,0,8,45};
		HashMap<String,List<Integer>> a2= new HashMap<>();
		for(int n:arr)
		{
			String key=(n%2==0)?"Even":"Odd";
			a2.putIfAbsent(key, new ArrayList<>());
			a2.get(key).add(n);
		}
		System.out.println(a2);
		int arr1[]= {1,3,5,2,5,6};
		HashMap<String , List<Integer>> a3= new HashMap<>();
		for(int n : arr1)
		{
			String key=(n%2==0)?"Even":"Odd";
			a3.putIfAbsent(key, new ArrayList<>());
			a3.get(key).add(n);
		}
		System.out.println(a3);
		//character position
		String s="Madhumitha";
		HashMap<Character,List<Integer>> a4= new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char key= s.charAt(i);
			a4.putIfAbsent(key, new ArrayList<>());
			a4.get(key).add(i);
		}
		System.out.println(a4);
		// new try
		String words1[] = {
			    "Madhu",
			    "Mango",
			    "Apple",
			    "Arun",
			    "Ball"
			};
		HashMap<Character,List<String>> a5= new HashMap<>();
		for (String w1:words1)
		{
			char key= w1.charAt(0);
			a5.putIfAbsent(key, new ArrayList<>());
			a5.get(key).add(w1);
		}
		System.out.println(a5);
		String words2[] = {
			    "Madhu",
			    "Mango",
			    "Apple",
			    "Arun",
			    "Ball"
			};
		HashMap<Character,List<String>> g= new HashMap<>();
		for(String f: words2)
		{
			char key=f.charAt(0);
			g.putIfAbsent(key, new ArrayList<>());
			g.get(key).add(f);
		}
		System.out.println(g);
	}

}
