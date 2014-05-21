/**
 * Program to count how many vowels there are on a string.
 */

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //char[] vowels = {'a','e','i','o','u'};
		String vowels = "aeiou";
		String words = args[0];
		int NumVowels = 0;
		for (int i=0;i<vowels.length(); i++){
			for (int j=0; j<words.length(); j++){
				// Wrong way if (words.charAt(j) == vowels.charAt(i)){NumVowels = NumVowels++;}
				//if (words.charAt(j) == vowels.charAt(i)){NumVowels = NumVowels + 1;}
				//if (words.charAt(j) == vowels.charAt(i)){NumVowels += 1;}
				//if (words.charAt(j) == vowels.charAt(i)){NumVowels++;}
				if (words.charAt(j) == vowels.charAt(i)){++NumVowels;}
			}
		}
		System.out.println("The number of vowels on the string "
		+ '"'+words+'"' + "is " + NumVowels);
	}
}
