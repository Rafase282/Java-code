/**
 * A class to negate an expression
 */
package interpreter;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 */
public final class NegateExpr extends Expr {
	private final Expr expr;
	NegateExpr(Expr e){
		expr = e;
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#eval()
	 */
	@Override
	public double eval() {
		return -expr.eval();
	}

	/* (non-Javadoc)
	 * @see interpreter.Expr#prettyPrint()
	 */
	@Override
	public String prettyPrint() {
		if (expr instanceof NegateExpr){
			return ((NegateExpr) expr).expr.prettyPrint();
		}else if  (expr instanceof Literal){
			double v=((Literal) expr).eval();
			return ""+(-v);
		}else{
			return "-"+expr.prettyPrint();
		}
	}
}
