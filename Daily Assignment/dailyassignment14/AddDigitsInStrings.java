package dailyassignment14;

public class AddDigitsInStrings {

	public static void main(String[] args) {
		String str = "ABC123D4";
		int sum = 0 ;
		for(int i=0 ;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println("The sum of the digits in the String : " +sum);
		
	}

}
