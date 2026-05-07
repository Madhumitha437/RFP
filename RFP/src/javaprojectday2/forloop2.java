package javaprojectday2;
import java.util.*;
public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=c.nextInt();
		int rev=0,rem;
		for(int i=0;n>0;i++)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("reverse:"+rev);
	}
}