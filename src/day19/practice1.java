package day19;
import java.util.regex.*;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mobile="9360781539";
		String email ="m1@gmail.com";
		String username="madhu";
		if(Pattern.matches("[0-9]{10}", mobile)&&Pattern.matches("[a-zA-z0-9._]+@[a-z]+\\.[a-z]+", email)&& Pattern.matches("[a-zA-Z0-9]{5,12}", username))
			System.out.println("valid");
		else
			System.out.println("Invalid");
		String password="Ma";
		if(Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}", password))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		String w="Madhu";
		if(Pattern.matches("[a-zA-Z]+",w))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
