package javaprojectday2;
import java.util.*;
public class while2 {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=c.nextInt();
		int rev=0,rem;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("reverse"+rev);
	}
}