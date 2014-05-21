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
public final class TimesExpr extends BinaryExpr {

	/**
	 * @param l
	 * @param r
	 */
	public TimesExpr(Expr l, Expr r) {
		super(l, r, "*");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public double eval() {
		return left.eval()*right.eval();
	}

}
