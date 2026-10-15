package arrayDebugging;

public class DebugSeparatePositiveNegativeAndZeroes {

	public static void main(String[] args) {
		int[] arr = {-4, 7, 0, -2, 9, 0, -8, 5};
		//int[] arr ={0, -1, 2, 0, 3, -4};
		//int[] arr ={-1, -2, -3};
		//int [] arr ={1, 2, 3};
		//int [] arr ={0, 0, 0};
		
		// Three arrays for this program , one for positive , negative and last one for zero and there corresponding counter 

		int positive[] = new int [arr.length];
		int negative[] = new int [arr.length];
		int zeroes[] = new int [arr.length];
		
		int pos=0;
		int neg=0;
		int zero=0;
		
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i]>0)
			{
				positive[pos] = arr[i];
				pos++;
			}
			else if(arr[i]<0)
			{
				negative[neg] = arr[i];
				neg++;
			}
			else
			{
				zeroes[zero] = arr[i];
				zero++;
			}
			
		}
		for (int i = 0 ;i<pos ; i++)
		{
			System.out.print(positive[i] + " ");
		}
		for (int i = 0 ;i<neg ; i++)
		{
			System.out.print(negative[i] + " ");
		}
		for (int i = 0 ;i<zero ; i++)
		{
			System.out.print(zeroes[i] + " ");
		}

	}

}
