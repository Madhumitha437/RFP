package day6;
import java.util.*;
public class prime {
	static boolean check(int no)
	{

		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				  return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		int no=c.nextInt();
		if(check(no))
			System.out.println(no +" is prime number");
		else 
			System.out.println(no+" is not a prime number");
		c.close();
	}

}