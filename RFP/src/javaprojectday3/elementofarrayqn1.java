package javaprojectday3;
import java.util.*;
public class elementofarrayqn1 {
	static void printelement(int arr[],int n)
	{
		for(int i=0;i<n;i++) 
		{
		System.out.println("Element :"+arr[i]);
		}
	}
	static void frequency(int arr[],int n)
	{
		int[] freq=new int[n];
		boolean[] count= new boolean[n];
		int i,j=0;
		for(i=0;i<n;i++)
		{
			freq[i]=1;
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					freq[i]++;
					count[j]=true;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(!count[i])
			{
				System.out.println("Element "+arr[i]+" appears:"+freq[i]);
			}
		}
	}
	static void largest(int arr[],int n)
	{
		int i,max=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element:"+max);
	}
	static void smallest(int arr[],int n)
	{
		int i,min=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest element:"+min);
	}
	static void evenposition(int arr[],int n) {
		System.out.println("Even element position");
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	static void reverse(int arr[],int n)
	{
		System.out.println("Reverse order:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	static void oddposition(int arr[],int n)
	{
		System.out.println("Odd position element");
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	static void duplicate(int arr[],int n)
	{
		int[] dup=new int[n];
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
	static void  sort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n ;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static void large2(int arr[],int n)
	{

		int max=0;
		int max2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max && arr[i]> max2)
			{
				max2=max;
				max=arr[i];
			}
			else if( arr[i]<max2 && arr[i]!=max)
			{
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=c.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=c.nextInt();
		}
		//1.Print element of array
		System.out.println("1.Print element of array:");
		printelement(arr,n);
		//2.Java Program to find the frequency of each element in the array
		System.out.println("Java Program to find the frequency of each element in the array");
		frequency(arr,n);
		//3. Java Program to print the largest element in an array
		System.out.println("Java Program to print the largest element in an array");
		largest(arr,n);
		//4.Java Program to print the smallest element in an array
		System.out.println("Java Program to print the smallest element in an array");
		smallest(arr,n);
		//5.Java Program to print the elements of an array present on an even position
		System.out.println("Java Program to print the elements of an array present on an even position");
		evenposition(arr,n);
		//6. Java Program to print the elements of an array in reverse order
		System.out.println(" Java Program to print the elements of an array in reverse order");
		reverse(arr,n);
		//7.Java Program to print the elements of an array present on odd position
		System.out.println("Java Program to print the elements of an array present on odd position");
		oddposition(arr,n);
		//8.Java Program to print the duplicate elements of an array
		System.out.println("Java Program to print the duplicate elements of an array");
		duplicate(arr,n);
		//9.Java Program to sort the elements of an array in ascending order
		System.out.println("Sort element in ascending order");
		sort(arr,n);
		//10.Find 2nd Largest Number in an Array
		System.out.println("2nd Largest Number in an Array");
		large2(arr,n);
	}

}
