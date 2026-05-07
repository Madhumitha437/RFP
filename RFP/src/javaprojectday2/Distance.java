package javaprojectday2;
import java.util.*;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d= new Scanner(System.in);
		System.out.println("value of x:");
		int x=d.nextInt();
		System.out.println("value of y:");
		int y=d.nextInt();
		double dis=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		System.out.println("Euclidean distance:"+dis);
	}

}
