//mamximum element in vector
package day16;
import  java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
public class peekelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(2);
		v.add(7);
		v.add(7);
		Iterator i= v.iterator();
		int maximum=Integer.MIN_VALUE;
		while(i.hasNext())
		{
			int element= (Integer)i.next();
			if(element>maximum)
			{
				maximum= element;
			}
		}
		System.out.println("Maximum :"+maximum);
		int max2=Collections.max(v);
		System.out.println(max2);
	}

	
	
}
