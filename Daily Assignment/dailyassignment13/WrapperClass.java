package dailyassignment13;

public class WrapperClass {

	public static void main(String[] args) {
		  char ch1 = '7';
	      char ch2 = 'A';
	      char ch3 = 'b';
	      
	      if(Character.isDigit(ch1))
	      {
	    	  System.out.println("The charecter " +ch1+ " is a digit");
	      }
	      else
	      {
	    	  System.out.println("The charecter " +ch1+ " is not a digit");  
	      }
	      
	      if(Character.isLetter(ch2))
	      {
	    	  System.out.println("The charecter " +ch2+ " is a letter");
	      }
	      else
	      {
	    	  System.out.println("The charecter " +ch2+ " is not a letter");
	      }
	      
	      char ch4=Character.toUpperCase(ch3);
	      System.out.println("Uppercase of b : " +ch4);
	}

}
