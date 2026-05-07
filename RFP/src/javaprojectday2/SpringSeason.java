package javaprojectday2;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("Month:");
		int m=c.nextInt();
		System.out.println("Day:");
		int d=c.nextInt();
		if ( m>=3 && m<=6)
		{
			if(m==3 && d>=20)
				System.out.println("True");
			else if(m<=6)
			{
				if(m==6 && d<=20)
				{
					System.out.println("True");
				}
				else
					System.out.println("False");
			}
			else
				System.out.println("False");		
		}
		else
			System.out.println("False");
	}

}
