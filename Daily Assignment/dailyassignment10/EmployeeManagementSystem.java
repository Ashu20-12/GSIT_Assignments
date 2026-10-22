package dailyassignment10;

class Employee
{
	int employeeid;
	String employeename;
	double salary;
	
	// parameterized constructor
	
	Employee(int employeeid , String employeename , double salary)
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.salary=salary;
	}
	
	// method to display the details of employee class
	
	void displaydetials() 
	{
		
		System.out.println("employee id : " +this.employeeid + ',' + " employee name : " + this.employeename + ',' + " employee salary : " + this.salary);
	}
	
	final void calculateBonus()
	{
		double bonus = salary*0.20;
		System.out.println("The bonus is : " + bonus );
	}
}

class Manager extends Employee
{

	Manager(int employeeid, String employeename, double salary) 
	{
		super(employeeid, employeename, salary);		
	}
	
	// cannot override the method as the calculate bonus method is final 
	
  //void calculateBonus()
  //{
  //	System.out.println("Bonus is available");
  //}
	
}
class Company
{
	final String COMPANY_NAME = "Tech Solutions Pvt. Ltd.";
	final int MAX_EMPLOYEES = 100 ;
	
	void displayCompanyDetails()
	{
		// COMPANY_NAME = "IBM";
		System.out.println("Company name : " + COMPANY_NAME);
		System.out.println("Maximum employees allowed : " + MAX_EMPLOYEES);
	}
}

final class SecurityPolicy
{
	void displayPolicy()
	{
		System.out.println("Policies displayed");
	}
}


// This will show the compile error as the security policy class is final and cannot be extended 
//class AdminPolicy extends SecurityPolicy
//{
//	void displayPolicy()
//	{
//		System.out.println("all the policies displayed");
//	}
//}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee e1 = new Employee(1 ,"Ashutosh Panda" , 12000);
		Employee e2 = new Employee(2 , "Siva Charan" , 23000);
		e1.displaydetials();
		e1.calculateBonus();
		e2.displaydetials();
		e2.calculateBonus();
		
		Company c = new Company();
		c.displayCompanyDetails();
		//c.COMPANY_NAME = "Infosys LTD";  // Due to final keyword , already assigned value to it .
		
		Manager m = new Manager(103 ,"amit" , 22000);
		m.displaydetials();
		m.calculateBonus();
		
		SecurityPolicy s=  new SecurityPolicy();
		s.displayPolicy();
		
		
		
		
		

	}

}
