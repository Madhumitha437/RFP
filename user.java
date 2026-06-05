package test;
import java.util.regex.*;
public class user {
	public boolean validatefirst(String fname)
	{
		return Pattern.matches("[A-Z][a-z]{2,}", fname);
	}
	public boolean validatelast(String lname)
	{
		return Pattern.matches("[A-Z][a-z]{2,}", lname);
	}
	public boolean validateemail(String email)
	{
		return Pattern.matches("[a-zA-Z0-9.+-]+@[a-z]+\\.[a-z].{2,}+", email);
	}
	public boolean validatemobile(String mobile )
	{
		return Pattern.matches("[1-9]{2} [0-9]{10}", mobile);
	}
	public boolean validatepassword(String password)
	{
		return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$",password);
	}
}
