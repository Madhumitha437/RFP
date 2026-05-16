package day6;
import java.util.*;
public class perfectno {
	static  boolean  per(int no)
	{
		int temp=0;;
		for(int i=1;i<=no/2;i++)
		{
			if(no%i==0)
			{
				temp=temp+i;
			}
		}
		if(temp==no)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		int no= c.nextInt();
		if(per(no))
			System.out.println(no+" is a perfect number");
		else 
			System.out.println(no + " is not a perfect number");
		c.close();
	}

}