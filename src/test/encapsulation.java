package test;
class student1
{
	private int studentid;
	private String studentname;
	private String dept;
	private double marks;
	student1(int studentid, String studentname,String dept,double marks)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		this.dept=dept;
		this.marks=marks;
		
	}
	 public void setdetails(int studentid, String studentname,String dept,double marks)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		this.dept=dept;
		this.marks=marks;
	}
	public int getid()
	{
		return studentid;
	}
	public String getname()
	{
		return studentname;
	}
	public String getdept()
	{
		return dept;
	}
	public double getmark()
	{
		return marks;
	}
	void display()
	{
		System.out.println("Student Id:"+getid());
		System.out.println("Student Name:"+getname());
		System.out.println("Department:"+getdept());
		System.out.println("Marks:"+getmark());
	}
	void highestavg(student1 s1, student1 s2, student1 s3)
	{
		if(s1.getmark()>s2.getmark() && s1.getmark()>s3.getmark())
			System.out.println("student 1 highest");
		else if(s2.getmark()>s3.getmark())
			System.out.println("Student 2 highest");
		else 
			System.out.println("Student 3 is highest");
		 double avg =(s1.getmark()+s2.getmark()+s3.getmark())/3;
		System.out.println("Average :"+avg);
	}
	void csdept(student1 arr[])
	{
		for (int i=0;i<3;i++)
		{
			if(arr[i].getdept().equalsIgnoreCase("cs"))
				arr[i].display();
		}
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1= new student1(101,"Madhu","cs",8.0);
		s1.display();
		student1 s2= new student1(102, "Azhara", "it", 8.5);
		s2.display();
		student1 s3= new student1(0,null,null,0);
		s3.setdetails(103,"Rahul","ECE",7.9);
		s3.display();
		s1.highestavg(s1, s2, s3);
		student1[] arr= {s1,s2,s3};	
		s1.csdept(arr);

	}

}
