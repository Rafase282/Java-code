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
public class Less extends Compare {

	/**
	 * @param l
	 * @param r
	 */
	public Less(Expr l, Expr r) {
		super(l, r, "<");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public boolean eval() {
		return left.eval()<right.eval();
	}

}
