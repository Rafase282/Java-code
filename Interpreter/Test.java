/**
 * 
 */
package interpreter;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 * 
 * subclass constructors:
 *   Equal(Expr, Expr)
 *   NotEqual(Expr, Expr)
 *   Less(Expr, Expr)
 *   LessEqual(Expr, Expr)
 *   Greater(Expr, Expr)
 *   GreaterEqual(Expr, Expr)
 *   Not(Test) 
 *   Or(Test, Test)
 *   And(Test, Test)
 */
public abstract class Test extends Node {
	public abstract boolean eval();

}
