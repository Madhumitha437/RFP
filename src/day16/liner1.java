package day16;
import java.util.Scanner;
public class liner1 {
	public int search(int arr[],int n) {
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				return i;
			}
		}
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=c.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=c.nextInt();
		}
		liner1 a= new liner1();
		System.out.println(a.search(arr,n));
		c.close();
	}

}
