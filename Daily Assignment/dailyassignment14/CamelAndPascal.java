package dailyassignment14;

public class CamelAndPascal {

	public static void main(String[] args) {
		String str = "i am good";

        String[] words = str.split(" ");

        String camelCase = "";
        String pascalCase = "";

        for (int i = 0; i < words.length; i++)
        {

            String word = words[i];

            if (i == 0)
            {
                camelCase = word.toLowerCase();

               
                pascalCase = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
            } 
            else 
            {
              
                String capitalized = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();

                camelCase = camelCase + capitalized;
                pascalCase = pascalCase + capitalized;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("CamelCase: " + camelCase);
        System.out.println("PascalCase: " + pascalCase);

	}

}
