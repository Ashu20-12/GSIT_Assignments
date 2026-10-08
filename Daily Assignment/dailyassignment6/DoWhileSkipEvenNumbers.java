package dailyassignment6;

public class DoWhileSkipEvenNumbers {

	public static void main(String[] args) {
		 int num = 1;
	        do {
	            if (num > 15) {
	                break;
	            }
	            if (num % 2 == 0) {
	                num++;
	                continue;
	            }
	            System.out.println(num);
	            num++;

	        } while (num <= 20);

	}

}
