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
public final class DivExpr extends BinaryExpr {

	/**
	 * @param l
	 * @param r
	 */
	DivExpr(Expr l, Expr r) {
		super(l, r, "/");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public double eval() {
		return left.eval()/right.eval();
	}

}
