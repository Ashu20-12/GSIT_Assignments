package dailyassignment20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Employee
{
	String name;
	double salary;
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}


public class Employee_Salary_Analysis_Stream_API {

	public static void main(String[] args) {
		Employee e1= new Employee("Rahul" ,	50000);
		Employee e2= new Employee("Priya" ,	70000);
		Employee e3= new Employee("Amit" ,	60000);
		List<Employee> list = new ArrayList<>();
		Collections.addAll(list, e1 ,e2 ,e3);
		
		System.out.println("Sorting Employees by salary in Ascending Order:");
		list.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).forEach(s->System.out.println(s.name + " : " +s.salary));
		
		System.out.println();
		
		System.out.println("Sorting Employees by salary in Descending Order:");
		list.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()).forEach(s->System.out.println(s.name + " : " +s.salary));
		
		System.out.println();
		
		System.out.println("Total salary:");
		double totalSalary = list.stream().mapToDouble(s->s.salary).sum();
		System.out.println(totalSalary);

	}

}
