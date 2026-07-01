package day16;
import java.util.TreeSet;
public class settree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(8);
		ts.add(6);
		ts.add(2);
		ts.add(7);
		ts.add(8);
		ts.add(1);
		System.out.println("Order :"+ts);
		System.out.println("Decending Order"+ts.descendingSet());
		System.out.println("Order :"+ts);
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
	}

}
