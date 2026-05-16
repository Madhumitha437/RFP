package day6;
import java.util.*;
public class reversenumber {
	
	static int rev(int no)
	{
		int rev=0;
		while(no>0)
		{
			rev=(rev*10)+(no%10);
			no=no/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("N:");
		int no=c.nextInt();
		System.out.println("Reverse no:"+rev(no));
		c.close();
	}

}