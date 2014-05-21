/**
 * The class that will be the super class for the other classes related to expressions of the interpreter.
 */
package interpreter;

/**
 * @author rafase282
 * Rafael J. Rodriguez
 * CMP277
 * rafase282@gmail.com
 * 
 *   subclass constructors:
 *   Literal(double)
 *   Variable(String)
 *   NegateExpr(Expr)
 *   PlusExpr(Expr, Expr)
 *   MinusExpr(Expr, Expr)
 *   TimesExpr(Expr, Expr)
 *   DivExpr(Expr, Expr)
 *   ModExpr(Expr, Expr)
 */
public abstract class Expr extends Node{
	abstract public double eval();

}
