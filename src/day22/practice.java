package day22;
import java.util.Arrays;
import java.util.List;

import java.util.*;
import java.util.stream.*;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sl = Arrays.asList("Banana","orange", "apple");
		Stream<String> s=sl.stream();
		//using lambA EXPRESSION
		s.forEach((element)->{System.out.println(element);
		});
		//using method references
		Stream<String> s2=sl.stream();
		s2.forEach(System.out::println);
		// convert list into  hashset
		Set<String> fruitset= new HashSet<>(sl);
		Stream<String> s3= fruitset.stream();
		s3.forEach(System.out::println);
		// convert a stream from Map
		Map<String,Integer> fruitmap=new HashMap<>();
		fruitmap.put("apple", 10);
		fruitmap.put("Banana", 15);
		Stream<Map.Entry<String, Integer>> s4=fruitmap.entrySet().stream();
		s4.forEach(System.out::println);
		//create a stream  form Map's keySet
		 Stream<String > mapkeyset=fruitmap.keySet().stream();
		 mapkeyset.forEach(System.out::println);
		 // create a stream from value set
		 Stream <Integer> mapvalueset= fruitmap.values().stream();
		 mapvalueset.forEach(System.out::println);
		 // create a stream from array
		 String[] arr= {"Banana", "Mango","Apple"};
		  Stream<String> arrstream=Arrays.stream(arr);
		  arrstream.forEach(System.out::println);
		  // create a stream using stream of method
		  Stream<String> ofstream=Stream.of("Apple","Kiwi");
		  ofstream.forEach(System.out::println);
		   
	}

}
