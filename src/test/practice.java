package test;
class student
{
	int studentid;
	String studentname;
	String dept;
	double marks;
	student(int studentid, String studentname,String dept,double marks)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		this.dept=dept;
		this.marks=marks;
		
	}
	void setdetails(int studentid, String studentname,String dept,double marks)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		this.dept=dept;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("Student Id:"+studentid);
		System.out.println("Student Name:"+studentname);
		System.out.println("Department:"+dept);
		System.out.println("Marks:"+marks);
		
	}
	void highestavg(student s1, student s2, student s3)
	{
		if(s1.marks>s2.marks && s1.marks>s3.marks)
			System.out.println("student 1 highest");
		else if(s2.marks>s3.marks)
			System.out.println("Student 2 highest");
		else 
			System.out.println("Student 3 is highest");
		 double avg =(s1.marks+s2.marks+s3.marks)/3;
		System.out.println("Average :"+avg);
	}
	void csdept(student arr[])
	{
		for (int i=0;i<3;i++)
		{
			if(arr[i].dept=="cs")
				display();
		}
	}
}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student(101,"Madhu","cs",8.0);
		s1.display();
		student s2= new student(102, "Azhara", "it", 8.5);
		s2.display();
		student s3= new student(0,null,null,0);
		s3.setdetails(103,"Rahul","ECE",7.9);
		s3.display();
		s1.highestavg(s1, s2, s3);
		student[] arr= {s1,s2,s3};	
		s1.csdept(arr);
	}
}
