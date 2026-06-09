package day22;
import java.util.*;
import java.util.stream.*;
public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		List <Integer> l= Arrays.asList(1,8,9,10,18,56,58,56,1,8);
		double numo=l.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);
		System.out.println("Average:"+numo);
		// sum of even and odd num
		int even=l.stream()
				.mapToInt(Integer::intValue)
				.filter(n->n%2==0)
				.sum();
		int odd=l.stream()
				.mapToInt(Integer::intValue)
				.filter(n->n%2!=0)
				.sum();
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
		// fin min and max
		int maxno=l.stream()
				.mapToInt(Integer::intValue)
				.max()
				.orElse(0);
		System.out.println(maxno);
		int minno=l.stream()
				.mapToInt(Integer::intValue)
				.min()
				.orElse(0);
		System.out.println(minno);
		//find unique element
		List<Integer> u= l.stream()
				.distinct()
				.toList();
		System.out.println(u);
		// find 2 largest & smallest
		int smin=l.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(0);
		System.out.println(smin);
		int smax= l.stream()
				.distinct()
				.sorted((a,b)->Integer.compare(b, a))
				.skip(1)
				.findFirst()
				.orElse(0);
		System.out.println(smax);
				
	}

}
