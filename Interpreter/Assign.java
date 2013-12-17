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
public final class Assign extends Stmt {
	private final Variable var;
	private final Expr expr;

	public Assign(Variable v, Expr e) {
		var=v;
		expr=e;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		var.set(expr.eval());
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		return var.prettyPrint()+"="+expr.eval()+";"+super.suffix();
	}

}
