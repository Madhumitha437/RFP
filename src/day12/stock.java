package day12;
import java.util.Scanner;
import java.util.ArrayList;
class stockdetails
{
	String stockname;
	int no_of_share;
	double share_price;
	double totalvalue;
	stockdetails(String stockname, int no_of_share,double share_price)
	{
		this.stockname=stockname;
		this.no_of_share=no_of_share;
		this.share_price=share_price;
		this.totalvalue=no_of_share*share_price;
	}
	
	void display() {
		System.out.println("Stockname:"+stockname);
		System.out.println("No .of share:"+no_of_share);
		System.out.println("Share_price:"+share_price);
		System.out.println("Total value:"+totalvalue);
	}
}
class stockportfolio 
{
	ArrayList<stockdetails> stocks= new ArrayList<>();
	void addstock(stockdetails s) {
		
		stocks.add(s);
	}
	void printreport()
	{
		for(stockdetails s: stocks)
		{
			s.display();
		}
	}
	void totalportfolio() {
		double fare=0;
		for(stockdetails s: stocks)
		{
			fare+=s.totalvalue;
		}
		System.out.println("Total value of all company:"+fare);
	}
}
public class stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		stockportfolio p= new stockportfolio();
		System.out.println("Enter the no of company:");
		int no= c.nextInt();
		c.nextLine();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the stock name:");
			String  stockname=c.nextLine();
			System.out.println("Enter the number of share:");
			int noofshare=c.nextInt();
			System.out.println("Enter the share price:");
			int shareprice=c.nextInt();
			c.nextLine();
			stockdetails s= new stockdetails(stockname, noofshare,shareprice);
			p.addstock(s);
		}
		p.printreport();
		p.totalportfolio();
		c.close();
	}

}
