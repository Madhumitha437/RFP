package day10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
class Contact
{
	String first_name;
	String last_name;
	String Address;
	String city;
	String State;
	int zip;
	String email;
	Contact(String first_name,String last_name, String Address, String city,String State, int zip,String email )
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.Address=Address;
		this.city=city;
		this.State=State;
		this.zip=zip;
		this.email=email;
	}
	void display()
	{
		System.out.println("First name:"+first_name);
		System.out.println("Last name:"+last_name);
		System.out.println("Address:"+Address);
		System.out.println("City:"+city);
		System.out.println("State:"+State);
		System.out.println("Zip:"+zip);
		System.out.println("Email:"+email);
	}
	
}
class Address
{
	Scanner c= new Scanner(System.in);
	ArrayList<Contact> arr = new ArrayList<>();
	void storing(Contact c)
	{
		arr.add(c);
		
	}
	void edit(String first_name,String last_name)
	{
		String email;
		int flag=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).first_name.equals(first_name) && arr.get(i).last_name.equals(last_name)){
				System.out.println("Enter the email:");
				email=c.nextLine();
				arr.get(i).email=email;
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("No name in the contact book");
		}
	}
	void delete(String first_name,String last_name)
	{
		int flag=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).first_name.equals(first_name) && arr.get(i).last_name.equals(last_name))
			{
				arr.remove(i);
				flag=1;
				System.out.println("Contact Deleted");
				break;
			}
		}
		if (flag==0)
			System.out.println("No name in contact book");
		
		
	}
	void display()
	{
	    for(int i=0;i<arr.size();i++)
	    {
	        arr.get(i).display();
	        System.out.println();
	    }
	}
	
}
public class Addressday10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		HashMap<String,Address> book=new HashMap<String, Address>();
		while(true) {
			System.out.println("1.Create address book");
			System.out.println("2.Select Address book");
			System.out.println("3.Display Address books");
			System.out.println("4.Exit");
			int achoice =c.nextInt();
			c.nextLine();
			String bookName;
			switch(achoice)
			{
			case 1:
				System.out.println("Enter Address Book Name:");
				 bookName= c.nextLine();
				if(book.containsKey(bookName))
				{
					System.out.println("Book already exits");
				}
				else
				{
					book.put(bookName,new Address());
					System.out.println("");
				}
				break;
			case 2:
				System.out.println("Enter the book name to select");
				bookName= c.nextLine();
				if(book.containsKey(bookName))
				{
					Address a= book.get(bookName);
					while(true) {
						System.out.println("1.Add");
						System.out.println("2.Display");
						System.out.println("3.Edit");
						System.out.println("4.Delete");
						System.out.println("5.Exit");
						int crud=c.nextInt();
						c.nextLine();
					
					switch(crud)
					{
					case 1:
						System.out.println("Enter the no student u wnat to store:");
						int scount=c.nextInt();
						c.nextLine();
						String first_name;
						String last_name;
						String pAddress;
						String city;
						String State;
						int zip;
						String email;
						for(int i=0;i<scount;i++)
						{
							System.out.println("Student "+(i+1));
							System.out.println("First name:");
							first_name=c.nextLine();
							System.out.println("Last name:");
							last_name= c.nextLine();
							System.out.println("Address");
							pAddress=c.nextLine();
							System.out.println("City:");
							city=c.nextLine();
							System.out.println("State:");
							State=c.nextLine();
							System.out.println("Zip:");
							zip=c.nextInt();
							c.nextLine();
							System.out.println("Email");
							email=c.nextLine();
							Contact c1=new Contact(first_name,last_name,pAddress,city,State,zip,email);
							a.storing(c1);
						}
						break;
					case 2:
						a.display();
						break;
					case 3:
						System.out.println("Enter the first name and last name");
						first_name=c.nextLine();
						last_name=c.nextLine();
						a.edit(first_name,last_name);
						break;
					case 4:
						System.out.println("Enter the first name and last name:");
						first_name=c.nextLine();
						last_name=c.nextLine();
						a.delete(first_name, last_name);
						break;
					case 5:
						System.out.println("Exiting from "+bookName);
						break;
					}
					if(crud==5)
						break;
				}
			}
				else
				{
					System.out.println("Adress book does not exit");
				}
			break;
			case 3:
				if(book.isEmpty())
					System.out.println("Address book is empty");
				else
				{
					for(String name: book.keySet())
						System.out.println(name);
				}
				break;
			case 4:
				System.out.println("Exit");
				c.close();
				return;
		}
		}
		}
	}


