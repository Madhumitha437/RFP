package day10;
import java.util.Scanner;
import java.util.ArrayList;
interface empwage

{
	void Monthlywage();
	void dailywage(int emppresence);
	void condition();
}
class wage implements empwage
{
	public  int part_time_wage=4;
	public int full_time_wage=8;
	int wage_per_hr;
	int no_of_working_days;
	int working_hr_per_month;
	String company_name;
	int total_wage;
	wage(String company_name,int wage_per_hr,int no_of_working_days,int working_hr_per_month)
	{
		this.company_name=company_name;
		this.wage_per_hr=wage_per_hr;
		this.no_of_working_days=no_of_working_days;
		this.working_hr_per_month=working_hr_per_month;
	}
	public int attendance()
	{
		int emppresence=(int)(Math.random()*3);
		return emppresence;
	}
	public String  getstatus(int emppresence)
	{
		switch(emppresence)
		{
			case 1: return "Full Time";
			case 2: return "Part Time";
			default: return "Absent";
		}
	}
	public int workingtime(int emppresence)
	{
		switch(emppresence)
		{
			case 1: return full_time_wage;
			case 2: return part_time_wage;
			default : return 0;
		}
	}
	public  void dailywage(int emppresence )
	{
		int workinghr=workingtime(emppresence);
		int wagesal=workinghr*wage_per_hr;
		System.out.println("Company name:"+company_name);
		System.out.println("Hours:"+workinghr);
		System.out.println("Dailywage:"+wagesal);
		
	}
	public void Monthlywage()
	{
		for(int i=1;i<=no_of_working_days;i++)
		{
			int attendance1=attendance();
			int workinghr=workingtime(attendance1);
			total_wage+=workinghr*wage_per_hr;
			
		}
		System.out.println("Company name:"+company_name);
		System.out.println("Montly wage:"+total_wage);
	}
	public void condition()
	{
		int min_hr=0;
		double min_day=0;
		while( min_hr<working_hr_per_month && min_day<no_of_working_days)
		{
			int attendance1=attendance();
			int workinghr=workingtime(attendance1);
			if( min_hr<working_hr_per_month && min_day<no_of_working_days)
			{
				total_wage+=workinghr*wage_per_hr;
			}
			min_hr+=workinghr;
			if(attendance1==1)
				min_day+=1;
			else if(attendance1==2)
				min_day+=0.5;
		}
		System.out.println("Company name:"+company_name);
		System.out.println("Montly wage :"+total_wage);
	}
}
class emparray
{
	ArrayList<wage> company=new ArrayList<>();
	public void addcmpy(wage w)
	{
		company.add(w);
	}
}
public class wage10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		emparray e= new emparray();
		System.out.println("Enter the no of company:");
		int n=c.nextInt();
		c.nextLine();
		for (int i=0;i<n;i++)
		{
		System.out.println("Enter the company name:");
		String name=c.nextLine();
		System.out.println("Enter the wage per hr:");
		int wh=c.nextInt();
		System.out.println("Enter the no .of working days:");
		int wd=c.nextInt();
		System.out.println("Enter the working hours per month:");
		int wm=c.nextInt();
		wage w= new wage(name,wh,wd,wm);
	
		e.addcmpy(w);
		System.out.println("Enter the option:");
		int option=c.nextInt();
		switch(option) {
		case 1: 
			System.out.println("Daily wage");
			int attendanceinfo=w.attendance();
			System.out.println(w.getstatus(attendanceinfo));
			w.dailywage(attendanceinfo);
			break;
		case 2:
			System.out.println("Monthly wage \n");
			w.Monthlywage();
			break;
		case 3:
			System.out.println("Until max working condition");
			w.condition();
			break;
		}
		}
		c.close();
	}

}
