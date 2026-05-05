package javaproject;

public class variable16 {
	void print()
	{
		System.out.println("This is the method.");
	}
	static void print1()
	{
		System.out.println("Static method is called.");
	}
	static int a=100;
	static
	{
		System.out.println("Static block executed before main method");
	}
	public static void main(String args[])
	{
		variable16 v= new variable16();
		System.out.println("Static variable is used :"+variable16.a);
		v.print();
		variable16.print1();
	}
}
