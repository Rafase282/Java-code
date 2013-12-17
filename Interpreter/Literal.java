/**
 * A class to evaluate literals
 */
package interpreter;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public final class Literal extends Expr {

	private final double value;
	Literal(double v) {
		value = v;
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
		return ""+value;
	}

}
