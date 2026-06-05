package test;
interface sport{
	void playsport();
}
interface cultural
{
	void culturals();
}
class person
{
	private int personid;
	private String name;
	private int age;
	 void setpersondetails(int personid,String name,int age)
	 {
		 this.personid=personid;
		 this.name=name;
		 this.age =age;
	 }
	 public int  getid()
	 {
		 return personid;
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public int getage() {
		 return age;
	 }
	 void displaystudent()
	 {
		 System.out.println("Id:"+getid());
		 System.out.println("Name :"+getname());
		 System.out.println("Age :"+getage());
	 }
}
class student2 extends person // single
{
	private String department;
	private int marks;
	void setStudentdetails(String department,int marks)
	{
		this.department=department;
		this.marks=marks;
	}
	String getdept()
	{
		return department;
	}
	int  getmark()
	{
		return marks;
	}
	void displaystudent()
	{
		super.displaystudent();
		System.out.println("Department :"+getdept());
		System.out.println("Marks :"+getmark());
	}
	void calgrade(int getmark)
	{
		if(marks<50)
			System.out.println("Fail");
		else if(marks>=50 && marks<=74)
			System.out.println("C");
		else if(marks>=75 && marks<=89)
			System.out.println("B");
		else 
			System.out.println("A");
	}
}
class placement extends student2 implements sport,cultural// Multilevel& multiple inhertance also hybrid 
{
	private String placement;
	void setplacement(String placement)
	{
		this.placement=placement;
	}
	public String getplacement()
	{
		return placement;
	}
	 public void playsport()
	{
		System.out.println("Playing cricket");
	}
	public void culturals()
	{
		System.out.println("Dancing" );
	}
	void displaystudent()
	{
		super.displaystudent();
		playsport();
		culturals();
		System.out.println("Company:"+getplacement());
	}

}
class teacher extends person // heriacherial
{
	private  String sub;
	private int sal;
	public void setteacherdetails(String sub, int sal)
	{
		this.sub=sub;
		this.sal=sal;
	}
	public String getsub()
	{
		return sub;
	}
	public int getsal()
	{
		return sal;
	}
	void displayteacher()
	{
		System.out.println("Id:"+getid());
		System.out.println("Name :"+getname());
	    System.out.println("Age :"+getage());
	    System.out.println("Subject:"+getsub());
	    System.out.println("Salary:"+getsal());
	}
}
public class inheritance {

	public static void main(String[] args) {
		placement s1= new placement();
		s1.setpersondetails(101,"Madhu",21);
		s1.setStudentdetails("cs", 89);
		s1.setplacement("zoho");
		s1.displaystudent();
		s1.calgrade(s1.getmark());
		teacher t1=new teacher();
		t1.setpersondetails(85,"Veena",56);
		t1.setteacherdetails("Data Science", 50000);
		t1.displayteacher();
		
	}

}
