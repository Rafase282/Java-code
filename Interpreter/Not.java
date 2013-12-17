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
public class Not extends Test {
	
	private final Test test;
	Not(Test t) {
		test=t;
	}

	/* (non-Javadoc)
	 * @see interpreter.Test#eval()
	 */
	@Override
	public boolean eval() {
		return !(test.eval());
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "(!"+test.prettyPrint()+")";
	}

}
