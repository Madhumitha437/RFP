package practicecollection;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10, 20, 10, 30, 20};
		LinkedHashMap<Integer,Boolean> map= new LinkedHashMap<>();
		for(int num:arr)
		{
			map.put(num,true );
		}
		System.out.println(map.values());
		String s="aacbbccef";
		LinkedHashMap<Character,Integer> map1= new LinkedHashMap<>();
		for(char c:s.toCharArray())
		{
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer>e: map1.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		//remove duplicates
		int arr1[] ={10, 20, 10, 30, 20, 40};
		LinkedHashMap<Integer,Boolean>  map2= new LinkedHashMap<>();
		for(int num:arr1)
		{
			map2.put(num,true);
		}
		System.out.println(map.keySet() );
		}

}
