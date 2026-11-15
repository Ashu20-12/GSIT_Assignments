package weeklyassignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Student_Marks_Calcu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks[] = new int[5];
		int total = 0;
		double average = 0;

		try {

		    System.out.println("Enter marks of 5 subjects:");

		    for (int i = 0; i < 5; i++) {
		        marks[i] = sc.nextInt();
		        total = total + marks[i];
		    }

		   
		    

		    average = total / 5.0;

		    System.out.println("Total Marks: " + total);
		    System.out.println("Average Marks: " + average);

		}
		catch (InputMismatchException e) {
		    System.out.println("Invalid input! Please enter integer marks.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Invalid array index!");
		}
		finally {
		    System.out.println("Marks calculation process completed");
		}

		sc.close();
	}  
}

