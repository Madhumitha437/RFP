package javaprojectday2;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d= new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter the value of a,b,c from the equation:");
		System.out.println("a:");
		a=d.nextDouble();
		System.out.println("b:");
		b=d.nextDouble();
		System.out.println("c:");
		c=d.nextDouble();
		double delta=(b*b)-(4*a*c);
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root 1:"+root1);
		System.out.println("Root 2:"+root2);
	}

}
