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
public class And extends Test {
	private final Test left;
	private final Test right;

	public And(Test l, Test r) {
		left=l;
		right=r;
	}

	/* (non-Javadoc)
	 * @see interpreter.Test#eval()
	 */
	@Override
	public boolean eval() {
		return left.eval() && right.eval();
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "("+left.prettyPrint()+"&&"+right.prettyPrint()+")";
	}

}
