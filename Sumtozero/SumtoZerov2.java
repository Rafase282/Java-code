/**
 * Program that find as many numbers as you want that add up to zero from a file.
 */
package sumtozero;

import java.util.*;
import java.io.*;

import javax.sound.midi.Sequence;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public abstract class SumtoZerov2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int loops = Integer.parseInt(args[0]);
		File filename = new File(args[1]);
		List<Integer> wholeList = makeIntList(filename);
		System.out.println(String.valueOf("The list of integer from the file: "+ filename+ " is "+"\n"+wholeList+"\n"));
		List<List<Integer>> sequences = new ArrayList<List<Integer>>();
		System.out.println("The list of "+ loops + " numbers that add up to zero is:");
		int nextIndex = 0;
		int testSum = 0;
		sequences.add(numFinder(wholeList,nextIndex,testSum,loops));
		System.out.println(sequences+"");
		sequences.clear();
		System.out.println("With a total of "+numSeqFinder(wholeList,nextIndex,testSum,loops)+ " sequences.");
		
	}
	
	/**
	 * Method for getting the numbers from a file in the system.
	 * @param fileName The full path to the file.
	 * @return List of integers from the file.
	 */
	private static List<Integer> makeIntList (File fileName){
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner source;
		try {
			source = new Scanner(fileName);
			while (source.hasNextInt()){
				numbers.add(source.nextInt());
			}
			source.close();
		} catch (FileNotFoundException e) {
			 System.err.println("Error: file not found!");
		}
		return numbers;
	}
	
	/**
	 * Method for finding the sequences of numbers that add up to zero.
	 * @param prenum Previous list of numbers that add up to zero.
	 * @param wholeList List of numbers
	 * @return New list of numbers that add up to zero
	 */
	private static List<Integer> numFinder(List<Integer> wholeList, int nextIndex, int testSum, int remainingLoops){
		List<Integer> sequences = new ArrayList<Integer>();
		List<Integer> newSeq = new ArrayList<Integer>();
		if (remainingLoops ==0){
			if (testSum==0){
				newSeq.add(wholeList.get(nextIndex-1)); //adds the last number used to get zero.
				return newSeq;
			}
			else {
				return newSeq;
			}
		}else{
			sequences.add(wholeList.get(nextIndex));
			for (int i=nextIndex; i<=wholeList.size()-remainingLoops; i++){
				newSeq.addAll(numFinder(wholeList, i+1, testSum+wholeList.get(i), remainingLoops-1));
			}
			return newSeq;
		}
	}

	private static int numSeqFinder (List<Integer> wholeList, int nextIndex, int testSum, int remainingLoops){
		if (remainingLoops==0){
			if (testSum==0)return 1;
			else return 0;
		}else{
			int sequences=0;
			for (int i = nextIndex; i<=wholeList.size()-remainingLoops; i++){
				sequences+= numSeqFinder(wholeList, i+1, testSum+wholeList.get(i), remainingLoops-1);
			}
			return sequences;
		}
	}
	
	/**
	 * Method for doing a deep copy of a list to another.
	 * @param seq Gets as input a list of integers that will be deep cloned.
	 * @return seq2 Returns a new list of integers with the same info as seq but is independent.
	 */
	private static List<Integer> store(List<Integer> seq){
		List<Integer> seq2 = new ArrayList<Integer>();
		Iterator<Integer> iter = seq.iterator();
		while (iter.hasNext()){
			seq2.add(iter.next());
		}
		return seq2;		
	}

}
