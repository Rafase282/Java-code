/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 * Help with loop from: http://www.cafeaulait.org/course/week2/32.html
 */
public class sum {

	/**
	 * @param args
	 * Console program to add any number of numbers.
	 * To subtract with this program just add positive to negative numbers ;-)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =0;
		int holder = 0;
		for (int i=0; i<args.length; i=i+1){
			holder = Integer.parseInt(args[i]);
			result = result + holder;
		}
		System.out.println("The sum of the numbers is: "+ result);
	}
}
