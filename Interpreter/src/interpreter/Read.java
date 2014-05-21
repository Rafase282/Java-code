/**
 * 
 */
package interpreter;

//import java.util.Arrays;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public class Read extends Stmt {
	private static int next =0;
	private static String[] args;
	static void setArgs(String[] a){
		args=a;
	}
	private final Variable var;

	public Read(Variable v) {
		var=v;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		//System.out.println(Arrays.toString(args));
		if (args.length!=0){
			Integer v = Integer.valueOf(args[next++]);
			var.set(v.doubleValue());
		}else {
			System.err.println("ERROR: no value to be read");
			System.exit(1);
		}
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "?"+var.prettyPrint()+";"+suffix();
	}

}
