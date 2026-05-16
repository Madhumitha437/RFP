package day6;
import java.util.*;
public class elapsed {
	static void time(int ishr,int ism,int iehr,int iem)
	{
		int ehr=iehr-ishr;
		int em=iem-ism;
		System.out.println("Elapsed time "+ehr+":"+em);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("Start time:");
		String start=c.nextLine();
		System.out.println("End Time:");
		String end=c.nextLine();
		String [] part1=start.split(":");
		String sshr=part1[0];
		String ssm=part1[1];
		int ishr=Integer.parseInt(sshr);
		int ism=Integer.parseInt(ssm);
		String [] part2=end.split(":");
		String sehr=part2[0];
		String sem=part2[1];
		int iehr=Integer.parseInt(sehr);
		int iem=Integer.parseInt(sem);
		time(ishr,ism,iehr,iem);
		c.close();
	}

}