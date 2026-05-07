package javaprojectday3;
import java.util.*;
public class elementofarray1 {
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=c.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=c.nextInt();
		}
		System.out.println("array entered");
		for(int i=0;i<n;i++)
		{
			 System.out.println(arr[i]);
		}
		int [] arr2;
		for(int arg: args)
		{
			arr2[arg]=c.nextInt();
		}
		
	}

}
