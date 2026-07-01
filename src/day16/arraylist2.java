package day16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
public class arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<>();
		a.add(3);
		a.add(0);
		a.add(0);
		a.add(78);
		a.add(90);
		a.add(3);
		// sorting using collection
		Collections.sort(a);
		System.out.println("Sorted:"+a);
		// reverse order
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		// find frequency of each element
		ArrayList<Integer> visited= new ArrayList<>();
		for (int i=0;i<a.size();i++)
		{
			int count=1;
			if (visited.contains(a.get(i)))
					{
					continue;
					}
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).equals(a.get(j)))
				{
					count++;
				}
			}
			visited.add(a.get(i));
			System.out.println(a.get(i)+" -> "+count);
		}
		// second larget;
		int max=Integer.MIN_VALUE;
		int smax= Integer.MIN_VALUE;
		for (int i=0;i<a.size();i++)
		{
			if(a.get(i)>max )
			{
				smax=max;
				max=a.get(i);
			}
			if(a.get(i)>smax && a.get(i)!=max)
			{
				smax=a.get(i);
			}
		}
		System.out.println("Second maximum:"+smax);
		// move all zeros to end
		ArrayList<Integer> a1 = new ArrayList<>();
		int count =0;
		for(Integer s:a)
		{
			if(s!=0)
			{
				a1.add(s);
			}
			else 
			{
				count++;
			}
		}
		while(count-- >0)
		{
			a1.add(0);
		}
		System.out.println("Zero at end:"+a1);
		a1.removeAll(a1);
		System.out.println(a1);
		int n=5;
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		int total=n*(n+1)/2;
		int sum=0;
		for(int s: a1)
		{
			sum+=s;
		}
		System.out.println("Missing:"+ (total-sum));
		a1.add(5);
		a1.add(2);
		System.out.println(a1);
		// using hashset
		HashSet <Integer> hs= new HashSet<>();
		for (int i: a1)
		{
			if(!hs.add(i))
			{
				System.out.println("First Repeating:"+ i);
				break;
			}
		}
		// non repeating elements
		HashSet <Integer> hs1= new HashSet<>();
		for (int i: a1)
		{
			if(!hs1.add(i))
			{
				continue;
			}
			else
			{
				hs1.add(i);
			}
		}
		System.out.println("Non repeating element"+ hs1);
	}
}
