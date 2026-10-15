package arrayDebugging;

public class DebugSecondlargestnumber {

	public static void main(String[] args) {
//        int[] arr = {0, 0, 0, 0, 0};
//
//        int largest = -1;
//        int secondLargest = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//            } else if (arr[i] > secondLargest
//                    && arr[i] != largest) {
//                secondLargest = arr[i];
//            }
//        }
//
//        System.out.println("Second Largest: " + secondLargest);
		
		//int[] arr = {0, 0, 0, 0, 0};
		//int[] arr = {-5, -6, -3, -2, 1};
		int[] arr = {0, -4, -8, -13, -1};
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest
                    && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

	}

}
