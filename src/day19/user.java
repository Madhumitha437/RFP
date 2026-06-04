package day19;
import java.util.regex.*;
import java.util.Scanner;
public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uc 1
		System.out.println("Enter First name:");
		Scanner c= new Scanner(System.in);
		String fname= c.nextLine();
		if (Pattern.matches("[A-Z][a-z].{2,}", fname))
		{
			System.out.println("Valid first name");
		}
		else 
		{
			System.out.println("Invalid first name");
		}
		// uc 2
		System.out.println("Enter Second name:");
		String lname= c.nextLine();
		if(Pattern.matches("[A-Z][a-z].{2,}", lname))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		//uc3 email validation
		System.out.println("Enter email Id:");
		String email= c.nextLine();
		if(Pattern.matches("[a-zA-Z0-9.+-]+@[a-z]+\\.[a-z].{2,}+", email))
		{
			System.out.println("Valid email id");
		}
		else
		{
			System.out.println("Invalid email id");
		}
		// uc4 phone no with country code
		System.out.println("Enter Mobile number :");
		String no= c.nextLine();
		if(Pattern.matches("[1-9]{2} [0-9]{10}", no))
		{
			System.out.println("Valid phone no");
		}
		else
		{
			System.out.println("Invalid Phone no");
		}
		// uc 5,6,7,8 password
		System.out.println("Enter the password:");
		String password=c.nextLine();
		if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",password))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid password");
		}
		c.close();
	}

}
