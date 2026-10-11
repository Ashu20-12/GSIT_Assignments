package weeklyassignment4;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		for(int i = 1 ; i<=arr.length+1 ; i++)
		{
			boolean found = false ;
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[j] == i)
				{
					found = true ;
					break;
				}
			}
			
			if(found == false)
			{
				System.out.println(" The missing number in the array is :  " + i);
			}
		}
	}

}
