package project;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.io.*;
import java.util.Comparator;
import java.util.Optional;
class salException extends Exception{
	public salException(String msg)
	{
		super(msg);
	}
}
class emailException extends Exception{
	public emailException(String msg)
	{
		super(msg);
	}
}
class employee
{
	private int empid;
	private String empname;
	private String dept;
	private String  designation;
	private float sal;
	private String email;
	private static final Logger logger =
	        Logger.getLogger(employee.class.getName());
	@Override
	public String toString()
	{
	    return empid + "," + empname + "," + dept + "," +
	           designation + "," + sal + "," + email;
	}
	public employee()
	{
		// default constructor
	}
	public employee(int empid,String empname,String dept,String  designation,float sal,String email)
	{
		this.empid= empid;
		this.empname=empname;
		this.dept= dept;
		this.designation=designation;
		this.sal= sal;
		this.email=email;
	}
	public int getEmpid() 
	{ 
		return empid; 
	}
    
	public void setEmpid(int empid) 
	{
		this.empid = empid; 
	}

    public String getEmpname() 
    { 
    	return empname; 
    }
    public void setEmpname(String empname) 
    { 
    	this.empname = empname; 
    }

    public String getDept() 
    {
    	return dept; 
    }
    public void setDept(String dept) 
    {
    	this.dept = dept; 
    }

    public String getDesignation()
    {
    	return designation; 
    }
    public void setDesignation(String designation)
    {
    	this.designation = designation;
    }

    public float getSal()
    {
    	return sal; 
    }
    public void setSal(float sal) 
    {
    	this.sal = sal; 
    }

    public String getEmail()
    {
    	return email; 
    }
    public void setEmail(String email) 
    {
    	this.email = email; 
    }
	void add_employee(String filename)
	{
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true)))
		{
		
			bw.write(getEmpid() + "," +
	                 getEmpname() + "," +
	                 getDept() + "," +
	                 getDesignation() + "," +
	                 getSal() + "," +
	                 getEmail());
			bw.newLine();
		}
		catch(IOException e)
		{
			System.out.println("File occured while opening file");
			logger.info("File occured while opening file");
		}
	}
	void display(String filename)
	{
		try(BufferedReader bw = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while((line=bw.readLine())!=null)
			{
			System.out.println(line);
			
			}
		}
		catch(IOException e)
		{
			System.out.println("File occured while opening");
			logger.info("File occured while opening file");
		}
	}
	 static void search_using_id(String filename, int id)
	{
		 int flag=1;
		 try(BufferedReader bw= new BufferedReader(new FileReader(filename)))
		 {
			 String line;
			 while((line=bw.readLine())!=null)
			 {
				 	String[] emp=line.split(",");
				 	if(Integer.parseInt(emp[0]) ==id)
				 	{
				 		 System.out.println("Employee Found");
			             System.out.println("Employee ID : " + emp[0]);
			             System.out.println("Name        : " + emp[1]);
			             System.out.println("Department  : " + emp[2]);
			             System.out.println("Designation : " + emp[3]);
			             System.out.println("Salary      : " + emp[4]);
			             System.out.println("Email       : " + emp[5]);
				 		 flag=0;
				 		 break;
				 	}
			 }
				 	if(flag==1)
				 	{
				 		System.out.println("Employee not found");
				 		logger.info("Employee details search:Failed ");
				 	}
		 }
		 catch(IOException e)
		 {
				System.out.println("File occured while opening");
				logger.info("File occured while opening file");
		 }
	}
	static void delete_using_id(String filename, int id)
	{
		ArrayList<String>  emp= new ArrayList<>();
		try
		{
			BufferedReader br= new BufferedReader(new FileReader(filename));
			String line ;
			int flag=1;
			while((line=br.readLine())!=null)
			{
				String[] emp1= line.split(",");
				if(Integer.parseInt(emp1[0])==id)
				{
					flag=0;
					continue;
				}
				emp.add(line);
			}
			br.close();
			if(flag==1)
			{
				System.out.println("Employee not found");
				logger.info("Employee Deletion : Failed- Emp id not found");
			}
			else
			{
				BufferedWriter bw= new BufferedWriter(new FileWriter(filename));
				for( String e:emp)
				{
					bw.write(e);
					bw.newLine();
				}
				bw.close();
				System.out.println("Employee deleted successfully");
			}
		}
		catch(IOException e)
		 {
				System.out.println("File occured while opening");
				logger.info("File occured while opening file");
		 }
	}
	static void sort_employees(String filename, int sort_choice)
	{
		List<employee> list = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(filename)))
	    {
	        String line;

	        while ((line = br.readLine()) != null)
	        {
	            String[] emp = line.split(",");

	            employee e = new employee(
	                    Integer.parseInt(emp[0]),
	                    emp[1],
	                    emp[2],
	                    emp[3],
	                    Float.parseFloat(emp[4]),
	                    emp[5]
	            );

	            list.add(e);
	        }
	    }
	    catch (IOException e)
	    {
	        System.out.println("Error reading file");
	        return;
	    }

	    switch (sort_choice)
	    {
	        case 1:
	            System.out.println("\n--- Sorted by Name ---");
	            list.stream()
	                    .sorted(Comparator.comparing(employee::getEmpname))
	                    . forEach(System.out::println);;
	            break;

	        case 2:
	            System.out.println("\n--- Sorted by Salary ---");
	            	list.stream()
	                    .sorted(Comparator.comparing(employee::getSal))
	                    . forEach(System.out::println);;
	            break;

	        case 3:
	            System.out.println("\n--- Sorted by Department ---");
	            list.stream()
	                    .sorted(Comparator.comparing(employee::getDept))
	                    . forEach(System.out::println);;
	            break;

	        default:
	            System.out.println("Invalid choice");
	            return;
	    }
	   
	}
	static void update_employee(String filename, int id)
	{
	    List<employee> list = new ArrayList<>();

	    // Step 1: Read file → List
	    try (BufferedReader br = new BufferedReader(new FileReader(filename)))
	    {
	        String line;

	        while ((line = br.readLine()) != null)
	        {
	            String[] emp = line.split(",");

	            employee e = new employee(
	                    Integer.parseInt(emp[0]),
	                    emp[1],
	                    emp[2],
	                    emp[3],
	                    Float.parseFloat(emp[4]),
	                    emp[5]
	            );

	            list.add(e);
	        }
	    }
	    catch (IOException e)
	    {
	        System.out.println("Error reading file");
	        return;
	    }
	    Optional<employee> emp_to_update = list.stream()
	            .filter(e -> e.getEmpid() == id)
	            .findFirst();

	    if (emp_to_update.isEmpty())
	    {
	        System.out.println("Employee not found");
	        logger.info("");
	        return;
	    }

	    Scanner sc = new Scanner(System.in);

	    employee emp = emp_to_update.get();

	    System.out.println("Enter new name (current: " + emp.getEmpname() + "): ");
	    emp.setEmpname(sc.nextLine());

	    System.out.println("Enter new department (current: " + emp.getDept() + "): ");
	    emp.setDept(sc.nextLine());

	    System.out.println("Enter new designation (current: " + emp.getDesignation() + "): ");
	    emp.setDesignation(sc.nextLine());

	    System.out.println("Enter new salary (current: " + emp.getSal() + "): ");
	    emp.setSal(sc.nextFloat());
	    sc.nextLine();

	    System.out.println("Enter new email (current: " + emp.getEmail() + "): ");
	    emp.setEmail(sc.nextLine());

	    // Step 3: Rewrite file
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
	    {
	        for (employee e : list)
	        {
	            bw.write(
	                    e.getEmpid() + "," +
	                    e.getEmpname() + "," +
	                    e.getDept() + "," +
	                    e.getDesignation() + "," +
	                    e.getSal() + "," +
	                    e.getEmail()
	            );
	            bw.newLine();
	        }
	    }
	    catch (IOException e)
	    {
	        System.out.println("Error writing file");
	        logger.info("Error while writing a file");
	        return;
	    }

	    System.out.println("Employee updated successfully");
	}
	static void filter_by_department(String filename, String deptName)
	{
	    List<employee> list = new ArrayList<>();

	    try (BufferedReader br = new BufferedReader(new FileReader(filename)))
	    {
	        String line;

	        while ((line = br.readLine()) != null)
	        {
	            String[] emp = line.split(",");

	            employee e = new employee(
	                    Integer.parseInt(emp[0]),
	                    emp[1],
	                    emp[2],
	                    emp[3],
	                    Float.parseFloat(emp[4]),
	                    emp[5]
	            );

	            list.add(e);
	        }
	    }
	    catch (IOException e)
	    {
	        System.out.println("Error reading file");
	        return;
	    }
	    List<employee> result = list.stream()
	            .filter(emp -> emp.getDept().equalsIgnoreCase(deptName))
	            .toList();
	    if (result.isEmpty())
	    {
	        System.out.println("\n No employees found in department: " + deptName);
	        return;
	    }
	    System.out.println("\n Employees in Department: " + deptName + "");
	    result.forEach(System.out::println);
	}
}
public class employee_management {

	private static final Logger logger=Logger.getLogger(employee_management.class.getName());
	static {
		try
		{
			FileHandler fh= new FileHandler("Employee.log",true);
			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void validateSal(float sal) throws salException
	{
		if (sal<5000)  throw new salException("Salary must be greater than 5000");
	}
	public static void validateEmail(String email) throws emailException
	{
		if (!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",email)) throw new emailException("Email wrong , Enter correct email");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("--Employye Management System--");
		while(true)
		{
		System.out.println("Menu");
		System.out.println("1.Add  Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Search Employee by employee Id");
		System.out.println("5.Sort employee y name /salary/department");
		System.out.println("6.Filter employee by department");
		System.out.println("7.Display Employee Info");
		System.out.println("8.Exit");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		int empid;
		String empname;
		String dept;
		String  designation;
		float sal;
		String email;
		String filename;
		sc.nextLine();
		switch(choice)
		{
			case 1:
				System.out.println("Enter the no of employee u  want to add:");
				int count =sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the file name:");
				filename=sc.nextLine();
				System.out.println(" opening file "+filename);
				for(int i=0;i<count;i++)
				{
				// try with resource 
				
					System.out.println("Employee "+(i+1));
					System.out.println("Enter EmpId:");
					empid=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee name:");
					empname=sc.nextLine();
					System.out.println("Enter department:");
					dept=sc.nextLine();
					System.out.println("Enter designation:");
					designation= sc.nextLine();
					System.out.println("Enter Sal:");
					sal=sc.nextFloat();
					sc.nextLine();
					try {
						validateSal(sal);
					}
					catch(salException e)
					{
						logger.warning(e.getMessage());
						continue;
					}
					System.out.println("Enter Email");
					email=sc.nextLine();
					try {
						validateEmail(email);
						
					}
					catch(emailException e)
					{
						logger.warning(e.getMessage());
						continue;
					}
					employee e1 = new employee();
					e1.setEmpid(empid);
					e1.setEmpname(empname);
					e1.setDept(dept);
					e1.setDesignation(designation);
					e1.setSal(sal);
					e1.setEmail(email);
					e1.add_employee(filename);
					logger.info("Employee Added Successfully");
				}
				break;
			case 2:
				//update
				 System.out.println("Enter filename:");
				 filename = sc.nextLine();
				 System.out.println("Enter employee id to update:");
				 int updateId = sc.nextInt();
				 sc.nextLine();
				 employee.update_employee(filename, updateId);
				 logger.info("Employee details updated successfully");
				 break;
			case 3:
				System.out.println("Enter the file name:");
				filename=sc.nextLine();
				System.out.println("Enter the employee id to view:");
				int delete_id=sc.nextInt();
				sc.nextLine();
				employee.delete_using_id(filename,delete_id);
				logger.info("Employee deleted using id");
				break;
				
			case 4:
				System.out.println("Enter the file name:");
				filename=sc.nextLine();
				System.out.println("Enter the employee id to view:");
				int search_id=sc.nextInt();
				sc.nextLine();
				employee.search_using_id(filename, search_id);
				logger.info("Employee details search using id");
				break;
			
			case 5:
				System.out.println("Sorting");
			    System.out.println("Enter filename:");
			    filename = sc.nextLine();
			    System.out.println("1.Sort by Name\n2.Sort by Salary\n3.Sort by Department");
			    int sort_choice = sc.nextInt();
			    sc.nextLine();
			    employee.sort_employees(filename, sort_choice);
			    logger.info("Sorted details displayed");
			    break;
			case 6:
			    System.out.println("Filtering using department");

			    System.out.println("Enter filename:");
			    filename = sc.nextLine();

			    System.out.println("Enter department name:");
			    String deptName = sc.nextLine();

			    employee.filter_by_department(filename, deptName);

			    logger.info("Filtered employees by department");
			    break;
			case 7:
				System.out.println("Enter the file name:");
				filename=sc.nextLine();
				System.out.println("Displaying content in that file ");
				employee e= new employee(0,"","","",0,"");
				e.display(filename);
				logger.info("Viewed all employee details");
				break;
			case 8:
				System.out.println("Exit program");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		
		}
		
	}
}
