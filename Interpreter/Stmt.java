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
 *    Assign(Variable, Expr)
 *    Read(Variable)
 *    Write(Variable)
 *    Write(String)
 *    If(Test, Stmt)
 *    If(Test, Stmt, Stmt)
 *    While(Test, Stmt)
 *    Block(Stmt, Stmt)*
 */
public abstract class Stmt extends Node {
	
	abstract public void interprete();
	private static int indentation = 2;
	protected String indent(){
		indentation++;
		return "";
	}
	protected String exdent(){
		indentation--;
		return "";
	}
	protected String prefix(){
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<indentation; i++){
			sb.append("  ");
		}
		return sb.toString();
	}
	protected String suffix(){
		return "\n";
	}

}
