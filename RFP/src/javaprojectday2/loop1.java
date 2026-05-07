package javaprojectday2;
import java.util.*;
public class loop1 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=c.nextInt();
		int sum=0;
		int a;
		System.out.println("Enter number:");
		for(int i=n;i>0;i--)
		{
			a=c.nextInt();
			sum+=a;
		}
		System.out.println("sum of natural no :"+sum);
	}

	}

