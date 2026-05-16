package day6;
import java.util.*;
public class fibonacci {
	void fibo(int n)
	{
		if (n==0)
			System.out.println("0");
		else if (n==1)
			System.out.println("0 1");
		else
		{
			int a=0;
			int b=1;
			int c,i;
			System.out.println(a+"\n"+b);
			for(i=0;i<n;i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d= new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=d.nextInt();
		fibonacci l= new fibonacci();
		l.fibo(no);
		d.close();
	}

}