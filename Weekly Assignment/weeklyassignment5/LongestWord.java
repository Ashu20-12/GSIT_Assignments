package weeklyassignment5;

public class LongestWord {

	public static void main(String[] args) {
		String sen = "Java programming is interesting";
		String words[] = sen.split(" ");
		String longest = " ";
		for(int i=0 ; i<words.length;i++)
		{
			String word = words[i];
			if(word.length() > longest.length())
			{
				longest = word;
			}
		}
		
		System.out.println("Longest word is : " +longest);

	}

}
