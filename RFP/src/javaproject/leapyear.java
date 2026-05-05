package javaproject;
import java.util.*;
public class leapyear {
	public static void main(String args[])
	{
		Scanner c= new Scanner(System.in);
		int year=c.nextInt();
		if( year>=1582)
		{
			if(year%4==0 & year%100== 0 & year %400==0)
				System.out.println(year+" is a Leap Year");
			else
				System.out.println(year+" is not a Leap Year");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
