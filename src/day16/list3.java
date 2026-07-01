package day16;
import java.util.TreeSet;
import java.util.HashSet;
public class list3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,3,9,6 ,0,100,8,3};
		int b[] = {2, 100,3, 5,6};
        int c[] = {2, 3, 6,100};
		TreeSet<Integer> a1= new TreeSet<>();
		for(Integer i:a)
		{
			a1.add(i);
		}
		System.out.println(a1);
		HashSet<Integer> a2= new HashSet<>();
		HashSet<Integer> a3= new HashSet<>();
		for(Integer i:a)
		{
			a2.add(i);
		}
		for(Integer i: b)
		{
			if(a2.contains(i)) {
				a3.add(i);
			}
		}
		for(Integer i:c)
		{
			if(a3.contains(i))
			{
				System.out.println(i);
			}
		}
	}
}
