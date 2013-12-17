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
public final class GreaterEqual extends Compare {

	/**
	 * @param l
	 * @param r
	 */
	public GreaterEqual(Expr l, Expr r) {
		super(l, r, ">=");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public boolean eval() {
		return left.eval()>right.eval()|| left.eval() == right.eval();
	}

}
