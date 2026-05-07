package javaprojectday2;
import java.util.*;
public class while1 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=c.nextInt();
		int sum=0;
		int a;
		System.out.println("Enter number:");
		while(n>0)
		{
			a=c.nextInt();
			sum+=a;
			n--;
		}
		System.out.println("sum of natural no :"+sum);
	}

}
