package day5;
import java.util.*;
public class leapyear {
	static int check(int year)
	{
		if (year%4==0)
		{
			if(year%100==0 & year%400==0)
			{
				return 1;
			}
			return 1;
		}
		else 
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Year:");
		int year=c.nextInt();
		if (year>1000)
		{
		if (check(year)==1)
				System.out.println(year+"is a leap year");
		else
				System.out.println(year+"is not a leap year");
		}
		else
			System.out.println("Invalid Input");
		c.close();
	}

}