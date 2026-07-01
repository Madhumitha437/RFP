package day5;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("N:");
		int n=c.nextInt();
		System.out.println("2");
		for(int i=3;i<n;i++)
		{
			if(n%i==0)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j!=0)
						System.out.println(i);
						
				}
			}
		}
		c.close();
	}
}