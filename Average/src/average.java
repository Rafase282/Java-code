/**
 * Program for calculating the average of a set of numbers.
 */

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		double average,sum,holder;
		length = args.length;
		sum=0;
		for (int i=0;
				i<length;
				i=i+1){
			holder= Integer.parseInt(args [i]);
			sum=sum+holder;
			}
		average=sum/length;
		System.out.println("The average is: "+average);
	}

}
