/**
 * Program to get the standard deviation of a string of numbers.
 */

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class StandarDeviation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	double mean,sum,holder,holder2,sqrt,sum2,mean2,standarDev;
		double sum=0.0;
		for (int i=0;i<args.length;i++){
			double holder=Double.parseDouble(args[i]);
			sum=sum+holder;
		}
		double mean=sum/args.length;
		double sum2=0.0;
		for (int j=0;j<args.length;j++){
			double holder=Double.parseDouble(args[j]);
			double power=Math.pow(holder - mean,2);
			sum2=sum2+power;
		}
		double mean2=(sum2/args.length);
		double standarDev=Math.sqrt(mean2);
		System.out.println("The stander deviation is: "+ standarDev+" and the mean is "+mean);

	}
}
