package day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ListIterator;
public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<>();
		a.add(3);
		a.add(78);
		a.add(null);
		a.add(90);
		a.add(3);
		// for loop
		System.out.println("For loop");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//for each loop
		System.out.println("For each loop");
		for(Integer al: a)
		{
			System.out.println(al);
		}
		// iterator
		System.out.println("Iterator");
		Iterator<Integer> i =a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Maximum");
		int max=Integer.MIN_VALUE;
		for(Integer al: a)
		{
			if(al!= null && al>max)
			{
				max=al;
			}
		}
		System.out.println("Maximum:"+max);
		// remove duplicate using hashset
		HashSet<Integer> hs= new HashSet<>(a);
		System.out.println("Duplicate remove"+hs);
		// remove duplicate using iterator
		a.add(3);
		a.add(null);
		a.add(90);
		ArrayList<Integer> a2= new ArrayList<>();
		Iterator<Integer> i2 =a.iterator();
		while(i2.hasNext())
		{
			Integer value= i2.next();
			if(a2.contains(value))
			{
				i2.remove();
			}
			else
				a2.add(value);
		}
		System.out.println("Duplicate with iterator:"+a);
		//find duplicate
		a.add(3);
		a.add(null);
		a.add(90);
		Iterator<Integer> i3 =a.iterator();
		ArrayList<Integer> a3= new ArrayList<>();
		int flag=0;
		while(i3.hasNext())
		{
			Integer value= i3.next();
			if(a3.contains(value))
			{
				System.out.println(value);
				flag=1;
				
			}
			else
				a3.add(value);
		}
		if(flag==0)
			System.out.println("No duplicate elements");
		// reverse Iterator
		ListIterator<Integer> li= a.listIterator(a.size());
		System.out.println("Reverse an arraylist");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
