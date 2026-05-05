package javaproject;
import java.util.*;
public class sum {

	public static void main(String args[])
	{
		int sum=0;
		int invalidcount=0;
		for(String arg:args)
		{
			try 
			{
				int n=Integer.parseInt(arg);
				sum+=n;
			}
			catch(NumberFormatException e)
			{
			invalidcount++;
			}
		}
		System.out.println("sum"+sum);
		System.out.println("Invalid Count:"+invalidcount);
}
}
