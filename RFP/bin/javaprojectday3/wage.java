package javaprojectday3;
import java.util.*;
public class wage {
	static int part_time_wage=4;
	static int full_time_wage=8;
	static int wage_per_hr=20;
	static int  attendance()
	{
		int emp= (int)(Math.random()*3);
		return emp;
	}
	static int workingtime(int empType) 
	{
	        switch(empType) {
	            case 1: return full_time_wage;
	            case 2: return part_time_wage;
	            default: return 0;
	        }
	 }

    static String getstatus(int emp)
    {
    	switch(emp)
    	{
    		case 1: return "Fulltime";
    		case 2: return  "Parttime";
    		default: return "Absent";
    	}
    }
    static void calculatedailywage()
    {
    		int empType = attendance();
    		int hours = workingtime(empType);
    		int wage = hours * wage_per_hr;
    		System.out.println("Status: " + getstatus(empType));
    		System.out.println("Hours: " + hours);
    		System.out.println("Daily Wage: " + wage);
    }

// UC 5: Monthly Wage
static void calculateMonthlyWage(int days) {
    int totalWage = 0;
    for(int i = 0; i < days; i++) {
        int empType = attendance();
        int hours = workingtime(empType);
        totalWage += hours*wage_per_hr;
    }
    System.out.println("Monthly Wage for " + days + " days: " + totalWage);
}

// UC 6: Wage till condition
static void calculateWageTillCondition(int maxHours, int maxDays) {
    int totalHours = 0;
    int totalDays = 0;
    int totalWage = 0;
    
    while(totalHours < maxHours && totalDays < maxDays) {
        totalDays++;
        int empType = attendance();
        int hours = workingtime(empType);
        
        if(totalHours + hours > maxHours) {
            hours = maxHours - totalHours;
        }
        
        totalHours += hours;
        totalWage += hours *wage_per_hr;
    }
    
    System.out.println("Days Worked: " + totalDays);
    System.out.println("Hours Worked: " + totalHours);
    System.out.println("Total Wage: " + totalWage);
}


    public static void main(String[] args) {
        System.out.println("Daily Wage ");
        calculatedailywage();
        
        System.out.println("\nMonthly Wage (20 days) ");
        calculateMonthlyWage(20);
        
        System.out.println("\n Wage till 100 hours or 20 days");
        calculateWageTillCondition(100, 20);
    }
}