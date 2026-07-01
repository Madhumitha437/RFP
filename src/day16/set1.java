package day16;
import java.util.HashSet;
public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Javaprogrammingg";
		HashSet<Character> a= new HashSet<>();
		for (char c:s.toCharArray())
		{
			if(a.contains(c))
			{
				System.out.println(c);
			}
			else 
				a.add(c);
		}
		System.out.println("Without duplicate:"+a);
	}

}
