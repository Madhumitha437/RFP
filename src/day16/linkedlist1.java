package day16;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashSet;
public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse linkedlist
		LinkedList<Integer> a=new LinkedList<>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(1);
		a.add(8);
		LinkedList<Integer> a2= new LinkedList<>();
		ListIterator<Integer> it= a.listIterator(a.size());
		while(it.hasPrevious())
		{
			a2.add(it.previous());
		}
		System.out.println( "Reversed:"+a2);
		//middle element
		System.out.println("Middle element:"+a.get(a.size()/2));
		// duplicate
		HashSet<Integer> hs= new HashSet<>(a);
		System.out.println("Without duplicate:"+hs);
		
	}

}
