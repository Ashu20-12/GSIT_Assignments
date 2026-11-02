package dailyassignment14_2;


abstract class Employee
{
	int employeeId;
	String employeeName;
	Employee(int employeeId , String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName = employeeName;
	}
	
	abstract double calculateSalary();
	
	void displayDetails() 
	{
		System.out.println("Employee Id : " +employeeId);
		System.out.println("Employee Id : " +employeeName);
	}
}

class FullTimeEmployee extends Employee
{
	double monthlySalary;
	
	FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
		super(employeeId, employeeName);
		this.monthlySalary=monthlySalary;
	}
	@Override
	double calculateSalary() {
		
		return monthlySalary;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Monthly Salary : " +calculateSalary());
	}
	
}

class PartTimeEmployee extends Employee
{
	int hoursWorked;
	double hourlyRate;
	
	PartTimeEmployee(int employeeId, String employeeName , int hoursWorked , double hourlyRate) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}

	@Override
	double calculateSalary() {
		
		return (hoursWorked*hourlyRate);
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Hours Worked : " +hoursWorked);
		System.out.println("Hourly Rate : " +hourlyRate);
		System.out.println("calculated Salary : " +calculateSalary());
	}
}

public class AbstractProgram {

	public static void main(String[] args) {
		FullTimeEmployee fe = new FullTimeEmployee(101 , "Rahul" , 50000);
		PartTimeEmployee pe = new PartTimeEmployee(102 , "Amit" , 80 , 300);
		System.out.println("Full time employee  ");
		System.out.println();
		fe.displayDetails();
		System.out.println();
		System.out.println("Part time employee  ");
		System.out.println();
		pe.displayDetails();

	}

}
