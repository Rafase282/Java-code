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
public final class If extends Stmt {
	private final Test test;
	private final Stmt stmt;
	private final Stmt stmt2;

	public If(Test t, Stmt s) {
		test=t;
		stmt=s;
		stmt2=null;
	}
	
	public If(Test t, Stmt s, Stmt s2){
		test=t;
		stmt=s;
		stmt2=s2;
	}

	/* (non-Javadoc)
	 * @see interpreter.Stmt#interprete()
	 */
	@Override
	public void interprete() {
		if (test.eval()){ 
			stmt.interprete();
		}else if (stmt2 != null){stmt2.interprete();}
	}

	/* (non-Javadoc)
	 * @see interpreter.Node#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		final String firstIf = "if "+test.prettyPrint()+" {"+super.suffix()+super.prefix()+stmt.prettyPrint()+"}";
		final String content = (stmt2==null) ? firstIf : firstIf+"else {"+super.suffix()+super.prefix()+stmt2.prettyPrint()+"}";
		/*
		StringBuffer sb = new StringBuffer();
		sb.append(prefix());
		sb.append("if ");
		sb.append(test.prettyPrint());
		sb.append(" {");
		indent();
		sb.append(stmt.prettyPrint());
		exdent();
		if (stmt2 !=null){
			sb.append(prefix());
			sb.append("else {");
			sb.append(suffix());
			indent();
			sb.append(stmt2.prettyPrint());
			exdent();
		}
		sb.append(prefix());
		sb.append("}");
		sb.append(suffix());
		return sb.toString();
		*/
		return content;
	}

}
