package dailyassignmentt9;

public class MethodOverloadingCircleSquare1 {

	public static void main(String[] args) {
		System.out.println("Area of circle : " + circle(5));
		System.out.println("Area of rectangle : " + rectangle(8,4));
	}
	
	static double circle(int r)
	{
		return 3.14*( Math.pow(r,2));
		
	}
	
	static float rectangle(int l , int b)
	{
		return l*b;
	}

}
