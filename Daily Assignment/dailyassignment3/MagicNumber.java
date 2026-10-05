package dailyassignment3;

public class MagicNumber {

	public static void main(String[] args) {
		int num = 172;
		int sum=0;
		for (; num >= 10; )
		{
            sum = 0;
            for (;num > 0;) 
            {
                sum = sum + num % 10;
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1) 
        {
            System.out.println("The given number is a Magic Number");
        } 
        else 
        {
            System.out.println("The given number is not a Magic Number");
        }

	}

}
