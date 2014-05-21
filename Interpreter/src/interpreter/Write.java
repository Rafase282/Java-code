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
public final class Write extends Stmt {
	
	private final String string;
	private final Expr expr;


	public Write(String s) {
		string=s;
		expr=null;
	}
	
	public Write(Expr e){
		string = null;
		expr = e;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		System.out.print(null==expr ? string : expr.eval());
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		final String content = null==expr ? "\""+string+"\"" : expr.prettyPrint();
		return "!"+content+";"+suffix();
	}

}
