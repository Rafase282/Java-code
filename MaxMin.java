/**
 * 
 */
package maxmin;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public abstract class MaxMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The Maximum number is: "+max(args));
		System.out.println("The Minimum number is: "+min(args));

	}
	public static int max(String[] args){
		int nextNum,max;
		max= Integer.parseInt(args[0]);
		for (int i=1;i<args.length; i++){
			nextNum=Integer.parseInt(args[i]);
			if (nextNum>max){
				max=nextNum;
				}
		}			
		return max;
  }
	public static int min(String[] args){
		int nextNum,min;
		min= Integer.parseInt(args[0]);
		for (int i=1;i<args.length; i++){
			nextNum=Integer.parseInt(args[i]);
			if (nextNum<min){
				min=nextNum;
			}
		}
		return min;
	}
}
