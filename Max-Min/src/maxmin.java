/**
 * Program that does a linear search
 * for the maximum and minimum values
 * of a list of integer from user input.
 */

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class maxmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nextNum,max,min;
		max= min = Integer.parseInt(args[0]);
		for (int i=1;i<args.length; i++){
			nextNum=Integer.parseInt(args[i]);
			if (nextNum>max){
				max=nextNum;
				}
			if (nextNum<min){
				min=nextNum;
			}
		}
		System.out.println("The Maximum number is: "+max);
		System.out.println("The Minimum number is: "+min);

	}

}
