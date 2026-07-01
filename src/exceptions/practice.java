package exceptions;
import java.util.Scanner;
class InvalidAge extends Exception
{
	public InvalidAge(String msg)
	{
		super(msg);
	}
}
public class practice {
	static void validAge(int age) throws InvalidAge
	{
		if(age<18)
		{
			throw new InvalidAge("Not eligile for voting");
		}
		System.out.println("Eligible for voting");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		try
		{
			validAge(age);
		}
		catch (InvalidAge e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		sc.close();
	}

}
