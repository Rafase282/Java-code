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
public class NotEqual extends Compare {

	/**
	 * @param l
	 * @param r
	 */
	public NotEqual(Expr l, Expr r) {
		super(l, r, "!=");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	// If the two objects are equals it returns 1, otherwise it returns 0.
	public boolean eval() {
		return left.eval() != right.eval();
	}

}
