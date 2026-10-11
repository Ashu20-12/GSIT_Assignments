package weeklyassignment4;

public class SecondLargestNumberArrays {

	public static void main(String[] args) {
		int arr[]= {12, 45, 7, 89, 34, 89, 56};
		int largest = arr[0];
		int secondlargest=arr[0];
		// for the largest element in the array 
		for (int i=0 ; i<arr.length;i++)
		{
			if(arr[i]> largest)
			{
	
				largest = arr[i];
				
			}
		}
		
		for (int i =0 ; i< arr.length ; i++)
		{
			if(arr[i]< largest && arr[i]>secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		
		System.out.println(" The second leargest element in the array is " + secondlargest);
		
	}

}
