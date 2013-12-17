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
public abstract class Compare extends Test {
	
	protected final Expr left;
	protected final Expr right;
	private final String cmp;

	public Compare(Expr l, Expr r, String compare) {
		left=l;
		right=r;
		cmp=compare;
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "("+left.prettyPrint()+cmp+right.prettyPrint()+")";
	}

}
