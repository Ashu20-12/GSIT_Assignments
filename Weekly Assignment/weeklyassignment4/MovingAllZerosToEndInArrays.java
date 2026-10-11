package weeklyassignment4;

public class MovingAllZerosToEndInArrays {

	public static void main(String[] args) {
		int arr[]= {0, 5, 0, 3, 8, 0, 2, 9};
		int index = 0;
		System.out.println("The array after moving all the zeros to the end : ");
		for(int i =0 ; i < arr.length ; i++)
		{
			if(arr[i]!=0)
			{
				arr[index] = arr[i];
				index++;
			}
			
		}
		for(;index < arr.length;)
		{
			arr[index]=0;
			index++;
		}
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
