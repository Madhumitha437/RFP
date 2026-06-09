package day22;
import java.util.*;
import java.util.stream.*;
public class practice2 {
	public static void main(String args[]) {
	List<String> fruits= Arrays.asList("Apple","Banana","Mango","Kiwi","Avacado");
	Stream<String> stream= fruits.stream();
	List<String> list= stream
			.peek(element->System.out.println("Before map() method"+element))
			.map(element -> element.toUpperCase())
			.peek(element-> System.out.println("After map() method:"+element))
			.toList();
	System.out.println(list);
	//name starts with "a"
	List<String> s= fruits.stream()
			.filter(name->name.startsWith("A"))
			.collect(Collectors.toList());
	System.out.println("Start with a :"+s);
	// square
	List<Integer> num= Arrays.asList(9,0,1,2,6,5);
	num.stream()
	.map(n->n*n)
	.forEach(System.out::println);
	// sum of integer
	int sumno= num.stream()
			.filter(n->n%2==0)
			.mapToInt(Integer::intValue)
			.sum();
	System.out.println("Sum:"+sumno);
	//sort
	fruits.stream()
	.map(String::toUpperCase)
	.sorted()
	.forEach(System.out::println);
	}
}
