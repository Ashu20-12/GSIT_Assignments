package dailyassignment5;

public class NumberCubesUsingWhile {

	public static void main(String[] args) {

        int n = 5;
        int i = 1;

        while (i <= n) {
            System.out.println(i + " → " + (int)Math.pow(i,3));    // Math.pow returns a double value so converting it explicitly to int .
            i++;
        }

	}

}
