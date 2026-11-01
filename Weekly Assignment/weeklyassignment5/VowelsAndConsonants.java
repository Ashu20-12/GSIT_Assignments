package weeklyassignment5;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String word = "Programming";
		int count=0;
		int count1=0;
		for(int i = 0 ; i<word.length() ; i++)
		{
			char ch = word.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Vowels : " +count);
		System.out.println("Consonants : " +count1);

	}

}
