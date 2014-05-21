/**
 * Program output:
 * 
 * Square Information: 

 Side: 2.0
 Area: 4.0
Circle Information: 

 Radius: 1.0
 Area: 3.141592653589793

Tests: 

 Area Circle / Area Square (Pi Approximation ): 0.7853981633974483

 Total threads to create: 80000
 Total points to create per thread: 10000
 Total points created: 800000000
 Total points in the circle: 121820197
 Area Circle / Area Square: 0.15227524625

The elapsed run time is : 57741 milliseconds, which are 57.741 seconds.
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
public class PiThread2 extends Thread {
	
	private static int maxPoints;
	private static int threads;
	private static long circleCount;
	public static void increment() {circleCount += 1;}

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
		System.out.println(" Area Circle / Area Square (Pi Approximation ): "+piApproximation+"\n");
		
		maxPoints = Integer.parseInt(args[1]);
		threads = Integer.parseInt(args[0]);
		PiThread2[] theThreads = new PiThread2[threads];
		
		// Creates as many threads as requested to populate the array of threads and then start them.
		for (int i=0;i<threads; i++) {
			PiThread2 t = new PiThread2();
			theThreads[i] = t;
			theThreads[i].start();
		}
		
		// Waits for each thread to finish.
		for (int s=0;s<threads; s++) {			
			theThreads[s].join();
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
				increment();
			}			
		}
	}

}
