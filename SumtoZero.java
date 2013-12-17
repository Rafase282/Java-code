/**
 * Program that finds two, then three numbers that add up to zero.
 */
package sumtozero;

import java.util.Arrays;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public abstract class SumtoZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("From the lis of numbers "+ Arrays.toString(args)+ " with a size of "+args.length+".");
		System.out.println("The additions that gets zero as a result are:"+"\n");
		for (int i=0; i<args.length; i++){
			// First loop, to find first number.
			for (int j=1+i; j<args.length; j++){
				// Second loop for the second number
				for (int k=1+j; k<args.length; k++){
					// Third loop for the second number
					int check = Integer.parseInt(args [i])+Integer.parseInt(args [j])+Integer.parseInt(args [k]);
					if (check==0){
						System.out.println(args[i]+"+"+args[j]+"+"+args[k]+"="+check);
				}
				
				}
				
			}
		}

	}

}