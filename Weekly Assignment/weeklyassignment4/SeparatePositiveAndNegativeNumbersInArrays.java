package weeklyassignment4;

public class SeparatePositiveAndNegativeNumbersInArrays {

	public static void main(String[] args) {
		int arr[] = {-4, 7, 0, -2, 9, 0, -8, 5};
		
		System.out.println("The required array is : ");
		for(int i=0 ;i<arr.length ; i++)
		{
			if(arr[i] > 0)
			{
				System.out.print(arr[i] + " " );
			}
		}
		for(int i=0 ;i<arr.length ; i++)
		{
			if(arr[i]<0)			
			{
				System.out.print(arr[i] + " " );
			}
		}
		for(int i=0 ;i<arr.length ; i++)
		{
			if(arr[i]==0)
			{
				System.out.print(arr[i] + " " );
			}
		}

	}

}
