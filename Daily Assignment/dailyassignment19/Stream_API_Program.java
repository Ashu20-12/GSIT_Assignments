package dailyassignment19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Employee
{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
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

public class Stream_API_Program {

	public static void main(String[] args) {
		Employee o1 = new Employee("Amit" , 45000);
		Employee o2 = new Employee("Rahul" , 65000);
		Employee o3= new Employee("Anjali" , 75000);
		Employee o4 = new Employee("Priya" , 40000);
		List<Employee> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		System.out.println("Employees earning more than 50000 : ");
		System.out.println();
		List<Employee> filter =list.stream().filter(s->s.getSalary()>50000).collect(Collectors.toList());
		filter.stream().forEach(s->System.out.println(s.name +" - " + s.salary));
		
		
	
	}

}
