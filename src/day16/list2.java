package day16;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		l.add(1);
		l.add(7);
		l.add(1);
		l.add(8);
		l.add(8);
		l.add(4);
		LinkedHashSet <Integer> l1= new LinkedHashSet<>();
		for(Integer a:l)
		{
			if(!l1.contains(a))
			{
				l1.add(a);
			}
		}
		System.out.println("Removed duplicates:");
		System.out.println(l1);
		HashSet<Integer> a= new HashSet<>(l1);
		System.out.println("without duplicates"+a);
	}
}
