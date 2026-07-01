package test;
import java.util.regex.*;
public class regexpractice1 {
	public static void main(String args[])
	{
		String fname="Arun";
		if(Pattern.matches("^[A-Z][a-z]{2,}", fname))
			System.out.println("Valid fname");
		else
			System.out.println("Invalid fname");
		String pincode="60000";
		if(Pattern.matches("^[6][0-9]{5}", pincode))
			System.out.println("Valid pincode");
		else
			System.out.println("Invalid Pincode");
		String check="Java";
		if(Pattern.matches("[a-zA-Z]*", check))
			System.out.println("valid check");
		else
			System.out.println("Invalid check");
	}
}
