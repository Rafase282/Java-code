/**
 * Program to take sentences and count the frequency of the words in it.
 */
package wordfreq;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public abstract class WordFreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = args[0];
		String[] words = sentence.split(" ");
		String word=words[0];
		String nextWord;
		System.out.println(sentence);
		for (int i=0;i<words.length;i++){
			int freq=0;
			for (int j=0;j<words.length;j++){
				word=words[i];
				nextWord=words[j];
				if (word.equals(nextWord)){
					freq++;				
				}
			}
			System.out.println("For the word "+'"'+word+'"'+", the frequency ratio is "+freq);
		}
	}

}
