package day16;
import java.util.TreeSet;
public class settree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeSet<Integer> set = new TreeSet<>();

	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(40);

	        System.out.println("Ceiling: " + set.ceiling(25));
	        System.out.println("Floor: " + set.floor(25));

	        System.out.println("Higher: " + set.higher(20));
	        System.out.println("Lower: " + set.lower(20));
	        

	        TreeSet<Integer> set1 = new TreeSet<>();

	        for (int i = 1; i <= 10; i++) {
	            set1.add(i);
	        }

	        System.out.println("HeadSet:");
	        System.out.println(set1.headSet(5));

	        System.out.println("TailSet:");
	        System.out.println(set1.tailSet(5));

	        System.out.println("SubSet:");
	        System.out.println(set1.subSet(3, 8));
	}

}
