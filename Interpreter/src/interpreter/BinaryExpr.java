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
public abstract class BinaryExpr extends Expr {
	
	protected Expr left;
	protected Expr right;
	protected String opSym;

	BinaryExpr(Expr l, Expr r, String op) {
		left=l;
		right=r;
		opSym=op;
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "("+left.prettyPrint()+opSym+right.prettyPrint()+")";
	}

}
