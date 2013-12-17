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
public class AreaAproxT2 extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		double piAproximation = circleArea/area;
		System.out.println(" Area Circle / Area Square: "+piAproximation+"\n");
		
		final double maxPoints = Double.parseDouble(args[1]);
		final int threads = Integer.parseInt(args[0]);
		
		Thread t = new Thread(new Runnable(){
			public void run() {
				try {
					for (int i=0; i<threads; i++) {
						System.out.println("Hello thread #"+i);
						double count = 0.0;
						Random r = new Random();
						for (int j=0;j<maxPoints; j++){
							double randomX = (r.nextDouble() * 2.0) - 1.0;
							double randomY = (r.nextDouble() * 2.0) - 1.0;
							if (((randomX*randomX)+(randomY*randomY))<1) {
								count+=1.0;
							}
						}
						double circlePoints = count;
						double aprox = circlePoints/maxPoints;
						System.out.println(" Total points to create: "+ (int) maxPoints);
						System.out.println(" Total points in the circle: "+ (int) circlePoints);
						System.out.println(" Area Circle / Area Square: "+ aprox + "\n");						
					}
				}
		        finally {
		        	long end = System.currentTimeMillis();
					long elapsedMilliSeconds = (end - start);
					double secs = ((double) elapsedMilliSeconds / 1000);
					System.out.println("The elapsed run time is : "+ elapsedMilliSeconds +" milliseconds, which are "+ secs + " seconds.");	
		        	
		        }
				
				
				}
			}
		);
		t.start();
	}
}
