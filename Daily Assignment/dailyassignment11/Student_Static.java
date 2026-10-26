package dailyassignment11;

public class Student_Static {
	int rollNumber;
	String name;
	static String collegeName = "ABC Engineering College";
	static int studentCount = 0;
	
	static
	{
		System.out.println("student class is initalized");
		System.out.println();
	}
	
	Student_Static(int rollNumber , String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		studentCount++;
	}
	
	static void changeCollegeName(String newcollegeName)
	{
		collegeName = newcollegeName;
		System.out.println("College Name updated successfully ");
		System.out.println();
	}
	
	void displayDetails()
	{
		System.out.println("Roll number : " + rollNumber );  
		System.out.println("Name : " + name );
		System.out.println("College Name : " + collegeName);
		System.out.println();
	}
	
	static void displayStudentCount()
	{
		System.out.println("Total Students : " +studentCount);
	}
	 
	public static void main(String[] args) {
		Student_Static s = new Student_Static(101 , "Rahul");
		Student_Static s1 = new Student_Static(102 , "Priya");
		Student_Static s2 = new Student_Static(103 , "Amit");
		
		s.displayDetails();
		s1.displayDetails();
		s2.displayDetails();
		
		
		Student_Static.displayStudentCount();
		System.out.println();
		
		Student_Static.changeCollegeName("XYZ Institute of Technology");
		
		s.displayDetails();
		s1.displayDetails();
		s2.displayDetails();
		
		Student_Static.displayStudentCount();
		
		
		
	}

}
