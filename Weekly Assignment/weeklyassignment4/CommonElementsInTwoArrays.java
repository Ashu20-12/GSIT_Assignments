package weeklyassignment4;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {10, 20, 30, 40, 50};
		int arr2[] = {30, 40, 60, 70, 50};
		
		System.out.print("common elements in between the two arrays are : ");
		for(int i =0 ; i<arr1.length ; i++)
		{
			int count = 0 ;
			for(int j=0 ; j<arr2.length ; j++)
			{
				if(arr1[i]==arr2[j])
				{
					count = count+1;
					System.out.print(arr1[i] + " ");
				}
			}
		}


	}

}
