package weeklyassignment2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153 ;
		int actualnum=num;
		int armsum=0;
		for(;num!=0;)
		{
			int digit = num%10;			
			armsum = armsum + digit*digit*digit;
			num=num/10;
			
		}
		if(armsum==actualnum)
		{
			System.out.println(" The given number " +actualnum+ " is an armstrong number");
		}
		else
			System.out.println(" The given number " +actualnum+ " is not an armstrong number");

	}

}
