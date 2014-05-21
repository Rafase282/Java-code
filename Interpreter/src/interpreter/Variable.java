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
public final class Variable extends Expr {
	private final String var;
	private double value = 0;

	Variable(String v) {
		var=v;
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public double eval() {
		return value;
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return var;
	}
	
	void set (double v) {
		value = v;
	}

}
