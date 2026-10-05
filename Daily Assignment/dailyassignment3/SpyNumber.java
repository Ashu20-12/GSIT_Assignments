package dailyassignment3;

public class SpyNumber {

	public static void main(String[] args) {
		int num=1124;
		int temp=num;
		int temp1=num;
		int sum=0;
		int multi=1;
		for(;temp>0;)
		{
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
			
		}
		for(;temp1>0;)
		{
			int digit1 = temp1%10;
			multi = multi*digit1;
			temp1=temp1/10;
		}
		
		if(sum == multi)
		{
			System.out.println("The given number " +num+ " is a spy number");
		}
		else
		{
			System.out.println("The given number " +num+ " is not a spy number");
		}
		

	}

}
