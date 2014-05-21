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
public final class Block extends Stmt {
	private final Stmt stmt1;
	private final Stmt stmt2;

	public Block(Stmt s1, Stmt s2) {
		stmt1=s1;
		stmt2=s2;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		stmt1.interprete();
		stmt2.interprete();
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return stmt1.prettyPrint()+stmt2.prettyPrint();
	}
;
}
