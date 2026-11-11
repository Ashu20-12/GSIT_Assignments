package dailyassignment18;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student_Hash
{
	int rollNo;
	String name;
	String course;
	Student_Hash(int rollNo , String name , String course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_Hash other = (Student_Hash) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	@Override
	public String toString() {
		return "Student_Hash [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
	
	
}

public class Student_Management_HashCode {

	public static void main(String[] args) {
		Student_Hash ob1=new Student_Hash(101, "Rahul", "Java");
		Student_Hash ob2=new Student_Hash(102, "Priya", "Python");
		Student_Hash ob3=new Student_Hash(101, "Rahul", "Java");
		Student_Hash ob4=new Student_Hash(103, "Amit", "Java");
		Student_Hash ob5=new Student_Hash(102, "Priya", "Java");
		Student_Hash ob6=new Student_Hash(101, "Rahul", "Selenium");
		Set<Student_Hash> set = new HashSet<>();
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);
		set.add(ob4);
		set.add(ob5);
		set.add(ob6);
		for(Student_Hash set1 :set)
		{
			System.out.println(set1);
		}
		System.out.println("Total Students : " +set.size());
		


	}

}
