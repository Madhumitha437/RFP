package javaprojectday2;

import java.util.*;

public class operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d= new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		int c=d.nextInt();
		int exp1=(b*c)+a;
		int exp2=(a/b)+c;
		int exp3=(a%b)+c;
		int exp4=(a*b)+c;
		int max=exp1,min=exp1;
		//using if else 
		if(max<exp2)
			max=exp2;
		else if(max<exp3)
			max=exp3;
		else if(max<exp4)
			max=exp4;
		
		if (min>exp2)
			min=exp2;
		else if(min>exp3)
			min=exp3;
		else if(min>exp4)
			min=exp4;
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		//using math min max function
		int max1=Math.max(Math.max(exp1 ,exp2),Math.max(exp3,exp4));
		int min1=Math.min(Math.min(exp1 ,exp2),Math.min(exp3,exp4));
		System.out.println("Using min max function");
		System.out.println("Max:"+max1);
		System.out.println("Min:"+min1);	
	}

}
