package dailyassignment6;

public class SwitchMenuBasedoperation {

	public static void main(String[] args) {
		 int choice = 3;
	        int a = 20;
	        int b = 5;

	        do {
	            switch (choice) {

	                case 1:
	                    System.out.println("Addition = " + (a + b));
	                    break;

	                case 2:
	                    System.out.println("Subtraction = " + (a - b));
	                    break;

	                case 3:
	                    System.out.println("Multiplication = " + (a * b));
	                    break;

	                case 4:
	                    System.out.println("Division = " + (a / b));
	                    break;

	                case 5:
	                    System.out.println("Exit");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }
	            choice=5;      //generates infinite loop thats why its necessary to make the choice to 5 so it will come out of the loop .

	        } while (choice != 5);
	}

}
