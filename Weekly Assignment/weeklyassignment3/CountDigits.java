package weeklyassignment2;

public class CountDigits {

	public static void main(String[] args) {
		int num = 987654;
		int count =0;
		for(;num!=0;)
		{
			count=count+1;
			num=num/10;
		}
		System.out.println(" Count of digits in the provided number : " +count);

	}

}
