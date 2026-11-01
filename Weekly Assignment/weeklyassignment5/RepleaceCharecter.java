package weeklyassignment5;

public class RepleaceCharecter {

	public static void main(String[] args) {
		String str = "banana";
		String result = " "; 
		for(int i =0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch=='a')
			{
				result = result + 'o';
			}
			else
			{
				result = result +ch;
			}
		}
		
		System.out.println("The modified string is : "+result);

	}

}
