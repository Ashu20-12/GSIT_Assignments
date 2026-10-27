package dailyassignment12;

import java.util.Scanner;

public class ScannerArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = s.nextInt();
		int a[] = new int[size];
		int sum =0 ;
		
		for(int i =0 ; i<size ; i++)
		{
			System.out.println("Enter element " +(i+1));
			a[i] = s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum of array elemeents : " +sum);

	}

}
