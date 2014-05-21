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
public class ModExpr extends BinaryExpr {

	/**
	 * @param l
	 * @param r
	 */
	public ModExpr(Expr l, Expr r) {
		super(l, r, "%");
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public double eval() {
		return left.eval()%right.eval();
	}

}
