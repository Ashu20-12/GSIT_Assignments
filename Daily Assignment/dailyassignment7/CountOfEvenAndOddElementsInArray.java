package dailyassignment7;

public class CountOfEvenAndOddElementsInArray {

	public static void main(String[] args) {
		int[]arr = {11, 24, 35, 42, 56, 67, 80, 93};
		int count=0;
		int count1=0;
		for(int i = 0 ;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("The no of Even elements present in the array is : " + count);
		System.out.println("The no of Odd elements present in the array is : " +count1);

	}

}
