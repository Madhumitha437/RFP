package javaprojectday2;
import java.util.*;
public class ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		if(n<10)
		{
			if(n==1)
				System.out.println("One");
			else if(n==2)
				System.out.println("Two");
			else if(n==3)
				System.out.println("Three");
			else if(n==4)
				System.out.println("Four");
			else if(n==5)
				System.out.println("Five");
			else if(n==6)
				System.out.println("Six");
			else if(n==7)
				System.out.println("Seven");
			else if(n==8)
				System.out.println("Eight");
			else
				System.out.println("Nine");
		}
		else
			System.out.println("Invalid Input");
	}

}
