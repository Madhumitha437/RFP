package day14;
import java.util.LinkedList;
import java.util.Collections;
class sortedlist
{
	LinkedList<Integer> l = new LinkedList<>();
	void add(int data )
	{
		l.add(data);
		Collections.sort(l);
	}
	void display()
	{
		for( int i:l)
		{
			System.out.println(i);
		}
	}
}
public class linkedliist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uc1
		LinkedList<Integer> l = new LinkedList<>();
		l.add(56);
		l.add(30);
		l.add(70);
		System.out.println("Linked listl1:"+l);
		//uc2
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(70);
		l2.add(30);
		l2.addFirst(56);
		System.out.println("Linked listl2:"+l2);
		//uc3
		LinkedList<Integer> l3 = new LinkedList<>();
		l3.addFirst(56);
		l3.add(30);
		l3.addLast(70);
		System.out.println("L3");
		for(Integer s:l3)
		{
			System.out.println(s);
		}
		//uc4
		System.out.println("L4");
		LinkedList<Integer> l4 = new LinkedList<>();
		l4.add(30);
		l4.addFirst(56);
		l4.add(1, 70);
		for(Integer s:l4)
		{
			System.out.println(s);
		}
		//uc5
		System.out.println("L3");
		l3.removeFirst();
		System.out.println(l3);
		System.out.println("L3");
		l3.pop();
		l3.pop();
		System.out.println(l3);
		//uc6
		LinkedList<Integer> l6 = new LinkedList<>();
		l6.add(56);
		l6.add(30);
		l6.add(70);
		System.out.println("Use case 6: L2");
		l6.removeLast();
		System.out.println(l6);
		//uc7
		System.out.println("30:");
		int flag=0;
		for (Integer s :l2)
		{
			if(s==30)
			{
				System.out.println("Node found");
				flag=1;
				break;
			}

		}
		if(flag==0)
			System.out.println("Node not found");
		//uc8
		System.out.println("insert 40 after 30");
		for(Integer s:l2)
		{
			if(s==30)
			{
				l2.add(40);
				flag=1;
				break;
			}
		}
		System.out.println(l2);
		if(flag==0)
			System.out.println("Node not found, 40 cannot be added");
		//uc9
		System.out.println("delete 40");
		for(Integer s:l2)
		{
			if(s==40)
			{
				l2.remove(s);
				flag=1;
				break;
			}
		}
		System.out.println(l2+"Size of l2 list:"+l2.size());
		if(flag==0)
			System.out.println("Node not found, 40 cannot be deleted");
		//uc 10
		sortedlist sl= new sortedlist();
		sl.add(56);
		sl.add(30);
		sl.add(40);
		sl.add(70);
		sl.display();
	}

}
