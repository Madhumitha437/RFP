package day9;
import java.util.Scanner;
class wagecalday9
{
	public  int part_time_wage=4;
	public int full_time_wage=8;
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
	public  void dailywage(int emppresence, int wage_per_company )
	{
		int workinghr=workingtime(emppresence);
		int wagesal=workinghr*wage_per_company;
		System.out.println("Hours:"+workinghr);
		System.out.println("Dailywage:"+wagesal);
		
	}
	public void Monthlywage(int days, int wage_per_company)
	{
		int  total_wage=0;
		for(int i=1;i<=days;i++)
		{
			int attendance1=attendance();
			int workinghr=workingtime(attendance1);
			total_wage+=workinghr*wage_per_company;
			
		}
		System.out.println("Montly wage:"+total_wage);
	}
	public void condition(int hr, int days, int wage_per_company)
	{
		int min_hr=0;
		double min_day=0;
		int total_wage=0;
		while( min_hr<hr && min_day<days)
		{
			int attendance1=attendance();
			int workinghr=workingtime(attendance1);
			if( min_hr<hr && min_day<days)
			{
				total_wage+=workinghr*wage_per_company;
			}
			min_hr+=workinghr;
			if(attendance1==1)
				min_day+=1;
			else if(attendance1==2)
				min_day+=0.5;
		}
		System.out.println("Montly wage :"+total_wage);
	}
}
public class wageday9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the wage :");
		int wage_per_company=c.nextInt();
		System.out.println("Enter the option:");
		int option=c.nextInt();
		wagecalday9 w= new wagecalday9();
		switch(option) {
		case 1: 
			System.out.println("Daily wage");
			int attendanceinfo=w.attendance();
			System.out.println(w.getstatus(attendanceinfo));
			w.dailywage(attendanceinfo,wage_per_company);
			break;
		case 2:
			System.out.println("Monthly wage \nEnter the Days:");
			int days=c.nextInt();
			w.Monthlywage(days,wage_per_company);
			break;
		case 3:
			System.out.println("Wage till reaching working hours");
			System.out.println("Enter the max working hours and days:");
			int mhr=c.nextInt();
			int mdays=c.nextInt();
			w.condition(mhr,mdays,wage_per_company);
			break;
		}
		c.close();
	}

}
