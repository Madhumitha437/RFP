package day5;
import java.util.*;
public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("N value:");
		int n=c.nextInt();
		if(n<=0)
		{
			System.err.println("Invalid");
			c.close();
			return;
		}
		System.out.println("Harmonic Number:");
		double h=0.0;
		for(int i=1;i<n+1;i++)
		{
			h=h+(1.0/i);
		}
		System.out.println(h);
		c.close();
	}

}