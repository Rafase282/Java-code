/**
 * Program that takes a list of integers, and find the largest increasing sequence of numbers, and how long it is.
 */
package lseqNum;
import java.util.ArrayList;
import java.util.List; 
import java.util.Iterator;
import java.util.Arrays;
/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public abstract class LseqNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<List<Integer>> sequences = new ArrayList<List<Integer>>();
		List<Integer> seq  = new ArrayList<Integer>();
		System.out.println("From the lis of numbers "+ Arrays.toString(args)+ " with a size of "+args.length+":"+"\n");
		for (int i=0; i<args.length; i++){  
			if (i==args.length-1){
				if ((Integer.parseInt(args[i-1]) < Integer.parseInt(args[i]))){
				seq.add(Integer.parseInt(args[i]));
				}
			}
			else{
				if (Integer.parseInt(args[i]) < Integer.parseInt(args[i+1])){
					seq.add(Integer.parseInt(args[i]));
					} 
				else if (seq.size() !=0){ 
					seq.add(Integer.parseInt(args[i]));
					sequences.add(store(seq));
					seq.clear();				
				}
			}
		}
		sequences.add(store(seq));
		System.out.println("The increasing sequence of numbers are "+sequences);
		if (sequences.size()>1){
			int maxSize = Integer.MIN_VALUE;
			List<Integer> largestList = null;
            for(List<Integer> li : sequences) {
                    if(maxSize < li.size()) {
                            maxSize = li.size();
                            largestList = li;
                    }
            }
            System.out.println("The largest list is: " + String.valueOf(largestList) +" with the size of "+largestList.size()+".");
		}
	}
	public static List<Integer> store(List<Integer> seq){
		List<Integer> seq2 = new ArrayList<Integer>();
		Iterator<Integer> iter = seq.iterator();
		while (iter.hasNext()){
			seq2.add(iter.next());
		}
		seq.clear();
		return seq2;		
	}
}