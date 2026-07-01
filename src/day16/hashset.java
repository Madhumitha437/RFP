package day16;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,2,1,4,5};
		HashSet<Integer> set= new HashSet<>();
		for(Integer a:arr)
		{
			if(set.contains(a))
			{
				System.out.println("First Reapting number:"+a);
				break;
			}
			set.add(a);
		}
		System.out.println(set);
	}

}
