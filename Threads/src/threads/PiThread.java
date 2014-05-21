/**
 * Output of the program:
 * 
Square Information: 

 Side: 2.0
 Area: 4.0
Circle Information: 

 Radius: 1.0
 Area: 3.141592653589793

Tests: 

 Area Circle / Area Square (Pi Approximation): 0.7853981633974483

 Total threads to create: 500000
 Total points to create per thread: 10000
 Total points created: 5000000000
 Total points in the circle: 3926950072
 Area Circle / Area Square: 0.7853900144

The elapsed run time is : 59105 milliseconds, which are 59.105 seconds.

 */

/**
 * 
 */
package threads;

import java.util.Random;

/**
 * @author Rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 *
 */
public class PiThread extends Thread {
	
	long localCount;
	private static int maxPoints;
	static long circleCount;
	private static int threads;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		final long start = System.currentTimeMillis();
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
		double piApproximation = circleArea/area;
		System.out.println(" Area Circle / Area Square (Pi Approximation): "+piApproximation+"\n");
		
		maxPoints = Integer.parseInt(args[1]);
		threads = Integer.parseInt(args[0]);
		PiThread[] theThreads = new PiThread[threads];
		
		// Creates as many threads as requested to populate the array of threads and then start them.
		for (int i=0;i<threads; i++) {
			PiThread t = new PiThread();
			theThreads[i] = t;
			theThreads[i].start();
		}
		
		// Waits for each thread to finish.
		for (int s=0;s<threads; s++) {			
			theThreads[s].join();
			circleCount += theThreads[s].localCount;
		}		
		
		long totalPoints = (long) maxPoints * (long) threads;
		double approx = (double) circleCount/ (double) totalPoints;
		System.out.println(" Total threads to create: "+ threads);
		System.out.println(" Total points to create per thread: "+ maxPoints);
		System.out.println(" Total points created: "+ totalPoints);		
		System.out.println(" Total points in the circle: "+ circleCount);
		System.out.println(" Area Circle / Area Square: "+ approx + "\n");		
		
		long end = System.currentTimeMillis();
		long elapsedMilliSeconds = (end - start);
		double secs = ((double) elapsedMilliSeconds / 1000);
		System.out.println("The elapsed run time is : "+ elapsedMilliSeconds +" milliseconds, which are "+ secs + " seconds.");
		

	}
	
	public void run() {
		Random r = new Random();
		for (int j=0;j<maxPoints; j++){
			double randomX = (r.nextDouble() * 2.0) - 1.0;
			double randomY = (r.nextDouble() * 2.0) - 1.0;
			if (((randomX*randomX)+(randomY*randomY))<1) {
				localCount+=1;
			}			
		}
	}

}
