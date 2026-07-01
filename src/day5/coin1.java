package day5;
import java.util.*;
public class coin1 {
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.println("No of times:");
		int no=c.nextInt();
		int heads=0,tails=0;
		double [] arr=new double[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=Math.random();
			System.out.println(arr[i]);
			if (arr[i]<0.5)
			{
				tails++;
			}
			else
				heads++;
		}
		System.out.println("Percentage of heads:"+(heads*100.0)/no);
		System.out.println("Percentage of tails:"+(tails*100.0)/no);
		c.close();
	}
}