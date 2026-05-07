package javaprojectday2;
import  java.util.*;
public class ifelse2 {
	public static void main(String args[])
	{
		Scanner c= new Scanner(System.in);
		int n=c.nextInt();
		if(n==1)
			System.out.println("unit");
		else if(n==10)
			System.out.println("Ten");
		else if(n==100)
			System.out.println("Hundred");
		else if(n==1000)
			System.out.println("Thousand");
		else
			System.out.println("Invalid input");
	}

}
