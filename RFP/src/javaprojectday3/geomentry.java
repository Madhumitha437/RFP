package javaprojectday3;
import java.util.*;
class Line{
	int x1,y1,x2,y2;
	Line(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double length(int x1,int y1,int x2,int y2)
	{
		return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
	}
	public boolean equals(Object obj)
	{
		Line l= (Line) obj;
		return this.x1==l.x1 &&
				this.y1==l.y1 && this.x2==l.x2 && this.y2==l.y2 ;
	}
	public  int compareto(double p1, double p2)
	{
		if (p1>p2)
			return 1;
		else if (p1<p2)
			return 2;
		else
			return 0;
		
	}
}
public class geomentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.length\n2.equality of two lines \n3.compare 2 lines \nEnter option:");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		int x1,x2,y1,y2,a1,a2,b1,b2;
		switch(d)
		{
			case 1:
				System.out.println("Enter points x1,y1,x2,y2:");
				x1=c.nextInt();
				y1=c.nextInt();
				x2=c.nextInt();
				y2=c.nextInt();
				Line l1=new Line(x1,y1,x2,y2);
				double line = l1.length(x1,y1,x2,y2);
				System.out.println("Length of line:"+line);
				break;
			case 2:
				System.out.println("Point of Line1:");
				x1=c.nextInt();
				y1=c.nextInt();
				x2=c.nextInt();
				y2=c.nextInt();
				System.out.println("Point of Line2:");
				a1=c.nextInt();
				b1=c.nextInt();
				a2=c.nextInt();
				b2=c.nextInt();
				Line l2=new Line(x1,y1,x2,y2);
				Line l3=new Line(a1,b1,a2,b2);
				if (l2.equals(l3))
					System.out.println("Line 1 and line 2 are equal");
				else
					System.out.println("Line 1 and line 2 are not equal");
				break;
			case 3:
				System.out.println("Point of Line1:");
				x1=c.nextInt();
				y1=c.nextInt();
				x2=c.nextInt();
				y2=c.nextInt();
				System.out.println("Point of Line2:");
				a1=c.nextInt();
				b1=c.nextInt();
				a2=c.nextInt();
				b2=c.nextInt();
				Line l4=new Line(x1,y1,x2,y2);
				Line l5=new Line(a1,b1,a2,b2);
				double p1=l4.length(x1, y1, x2, y2);
				double p2=l5.length(a1, b1, a2, b2);
				 int res=l4.compareto(p1,p2);
				 if (res==1)
					 System.out.println("Line 1 is greater than line 2");
				 else if(res ==2)
					 System.out.println(" Line 2 is greater than line 2");
				 else 
					 System.out.println("Line 1 and line 2 are equal");
				 break;
			default: 
				System.out.println("");
				break;
		}
	}
}





