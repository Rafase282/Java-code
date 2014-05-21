/**
 * 
 */
package interpreter;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class FactorProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);					
		if (n<1){
			System.out.println(n+" is an illegal argument.");}
		else if (n==1){ 
			System.out.println(n+" is the unit.");}
		else{
			int f = 0;
			int i = 2;
			while (i<=n){
				if (0==(n%i)){
					n=n/i;
					f=f+1;
					if (1==f){
						System.out.println(args[0]+" has factors: \n");}					
					else{
						System.out.print(", ");}
					System.out.print(i);
				}
				else{
					i+=1;}
				}
			if (0==f){
				System.out.println(f+" is prime.");}

		}}}
