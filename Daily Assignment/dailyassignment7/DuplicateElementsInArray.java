package dailyassignment7;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int [] arr ={10, 20, 30, 20, 40, 10, 50, 30, 60};
		System.out.print("The duplicate elements present in the array are : ");
		for (int i = 0; i < arr.length; i++) 
		{
            boolean dupli = false;

            for (int j = 0; j < i; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    dupli = true;
                    break;
                }
            }

            if (dupli == false) 
            {

                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] == arr[j]) 
                    {
                        System.out.print(arr[i] +" ");
                        break;
                    }
                }

            }
        }
	}

}
