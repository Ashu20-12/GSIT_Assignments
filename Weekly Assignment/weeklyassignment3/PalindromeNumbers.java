package weeklyassignment2;

public class PalindromeNumbers {

	public static void main(String[] args) {
		int num = 1221;
		int original=num;
		int reversenum =0;
		for(;num > 0;) {
	          int digit = num % 10;
	          reversenum = reversenum * 10 + digit;
	          num = num / 10;
	      }
		if(reversenum==original)
		{
			System.out.println(" The given number " +original+ " is a palindrome number");
		}
		else
		{
			System.out.println(" The given number " +original+ " is not a palindrome number");
		}

	}

}
