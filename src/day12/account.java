package day12;
import java.util.Scanner;
class money
{
	private double amount;
	public void setter(double amount)
	{
		this.amount=amount;
	}
	public double getter()
	{
		return amount;
		
	}
	void checkbalance()
	{
		if (getter()<=0)
		{
			System.out.println("No balance");
		}
		else
			System.out.println("Amount:"+getter());
	}
	void withdraw(double debit)
	{
		if(debit>getter())
				{
			System.out.println("amount cannot be withdrawed because the amount is less");
		}																				
		else
		{
			amount=amount-debit;
			System.out.println("Withdrawn amount:"+amount);
		}
	}
	
}
public class account {
	public static void main(String args[])
	{
		Scanner c= new Scanner(System.in);
		System.out.println("enter the inital amount:");
		double inital= c.nextInt();
		money m= new money();
		m.setter(inital);
		System.out.println("Inital amount:"+m.getter());
		System.out.println("enter the amount to be withdrawn:");
		double debit = c.nextInt();
		m.withdraw(debit);
		c.close();
	}

}
