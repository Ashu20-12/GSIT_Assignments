package arrayDebugging;

public class SecondLargestByInitialisingArrayFirstElement {

	public static void main(String[] args) {
//        int[] arr = {-5, -2, -9, -4};
//
//        int largest = arr[0];
//        int secondLargest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//            } else if (arr[i] > secondLargest
//                    && arr[i] != largest) {
//                secondLargest = arr[i];
//            }
//        }
//
//        System.out.println("Largest: " + largest);
//        System.out.println("Second Largest: " + secondLargest);
		
		
		
//      int[] arr = {10, 10, 8, 5};
		int[] arr = {7, 7, 7};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        // initialization of Largest remains the first element of the array but changed the initialization of secondLargestElement 
        //of the array to Integer.vlaue because due to this only we are unable to enter the else if loop if in the array there are 
        //consecutively same element and at last added a if condition to check whether the second largest element is same as
        //initialization or it is changed 
        

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest
                    && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        
        if(secondLargest  == Integer.MIN_VALUE)
        {
        	System.out.println("NO second Largest Element");
        }
        else
        {
        	 System.out.println("Second Largest: " + secondLargest);
        }
       

	}

}
