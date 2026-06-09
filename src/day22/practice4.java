package day22;
import java.util.*;
import java.util.stream.*;
public class practice4 {
	public static void main(String args[]){
		List<String> s = Arrays.asList("Madhu","Azhara","Selvi","Nashwa","Abi","Nithya","Swetha","Swetha");
		//uppercase
		s.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		//lowercase
		s.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
		//removedupliactes
		s.stream()
		.distinct()
		.toList()
		.forEach(System.out::println);
		// sort a-z
		s.stream()
		.sorted()
		.toList()
		.forEach(System.out::println);
		//sort z-a
		s.stream()
		.sorted((a,b)->b.compareTo(a))
		.forEach(System.out::println);
		//starts with a
		char b='M';
		long clt=s.stream()
		.filter(a->a.startsWith(String.valueOf(b)))
		.count();
		System.out.println(clt);
		
	}
}
