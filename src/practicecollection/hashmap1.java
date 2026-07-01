package practicecollection;
import java.util.HashMap;
import java.util.Map;
public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Mango");
		map.put(3, "Apple");
		map.put(8, "kiwi");
		System.out.println("Map:"+map);
		System.out.println("Key   | value");
		for(Map.Entry<Integer,String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"   |  "+entry.getValue());
		}
		System.out.println("Keys:");
		for(Integer a:map.keySet())
		{
			System.out.println(a);
		}
		System.out.println("Value:");
		for(String a:map.values())
		{
			System.out.println(a);
		}
		//non repeating 
		String s="aabbccdef";
		HashMap<Character,Integer> map1= new HashMap<>();
		for(char c:s.toCharArray())
		{
			map1.put(c, map1.getOrDefault(c,0)+1);
		}
		System.out.println("Frequency:");
		for(Map.Entry<Character, Integer> entry1: map1.entrySet())
		{
			System.out.println(entry1.getKey()+"->"+entry1.getValue());
		}
		for(char c:s.toCharArray())
		{
			if(map1.get(c)==1)
			{
				System.out.println("First non - repeating:"+c);
				break;
			}
		}
	}

}
