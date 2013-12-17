/* Output of the program.
	Square Information: 
	
	 Side: 2.0
	 Area: 4.0
	Circle Information: 
	
	 Radius: 1.0
	 Area: 3.141592653589793
	
	Tests: 
	
	 Area Circle / Area Square: 0.7853981633974483
	
	 Total points to create: 10000
	 Total points in the circle: 7872
	 Area Circle / Area Square: 0.7872
	
	The elapsed run time is : 8 milliseconds, which are 0.008 seconds.
 */

package threads;

import java.util.Random;
/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class AreaAprox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("Square Information: \n");
		double side = (1 - (-1));
		double area = side * side;
		System.out.println(" Side: "+side);
		System.out.println(" Area: "+area);
		
		System.out.println("Circle Information: \n");
		double radius = side/2.0;
		double circleArea = Math.PI * (radius * radius);
		System.out.println(" Radius: "+ radius);
		System.out.println(" Area: "+ circleArea + "\n");
		
		System.out.println("Tests: \n");
		double piAproximation = circleArea/area;
		System.out.println(" Area Circle / Area Square: "+piAproximation+"\n");
		
		double maxPoints = Double.parseDouble(args[1]);
		double circlePoints = pointGenerator(maxPoints);
		double aprox = circlePoints/maxPoints;
		System.out.println(" Total points to create: "+ (int) maxPoints);
		System.out.println(" Total points in the circle: "+ (int) circlePoints);
		System.out.println(" Area Circle / Area Square: "+ aprox + "\n");
		long end = System.currentTimeMillis();
		long elapsedMilliSeconds = (end - start);
		double secs = ((double) elapsedMilliSeconds / 1000);
		System.out.println("The elapsed run time is : "+ elapsedMilliSeconds +" milliseconds, which are "+ secs + " seconds.");
	}
	
	public static double pointGenerator(double maxPoints) {
		double count = 0.0;
		Random r = new Random();
		for (int i=0;i<maxPoints; i++){
			double randomX = (r.nextDouble() * 2.0) - 1.0;
			double randomY = (r.nextDouble() * 2.0) - 1.0;
			if (((randomX*randomX)+(randomY*randomY))<1) {
				count+=1.0;
			}
		}
		return count;
	}

}
