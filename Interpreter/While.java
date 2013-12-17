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
public final class While extends Stmt {
	private final Test test;
	private final Stmt stmt;


	public While(Test t, Stmt s) {
		test=t;
		stmt=s;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		while (test.eval()){
			stmt.interprete();	
		}
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return "while "+test.prettyPrint()+"{"+super.suffix()+super.prefix()+stmt.prettyPrint()+super.suffix()+"}";
	}

}
