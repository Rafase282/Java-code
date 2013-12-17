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
public final class Evaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Expr l5 = new Literal(5);
		Expr n5 = new NegateExpr(l5);
		Expr l3 = new Literal(3);
		Expr p = new PlusExpr(l3,n5);
		String pp = p.prettyPrint();
		double pi = p.eval();
		System.out.println(pp+"="+pi);
		
		Expr nn5 = new NegateExpr(n5);
		Expr p2 = new PlusExpr(p,nn5);
		String pp2 = p2.prettyPrint();
		double pi2 = p2.eval();
		System.out.println(pp2+"="+pi2);
		
		Expr nn6 = new NegateExpr(l5);
		Expr p3 = new MinusExpr(p,nn6);
		String pp3 = p3.prettyPrint();
		double pi3 = p3.eval();
		System.out.println("This one is in the format a-b=c");
		System.out.println(pp3+"="+pi3);
		
		Expr p4 = new DivExpr(p,nn6);
		String pp4 = p4.prettyPrint();
		double pi4 = p4.eval();
		System.out.println(pp4+"="+pi4);
		System.out.println();
		
		Expr p5 = new TimesExpr(p,nn6);
		String pp5 = p5.prettyPrint();
		double pi5 = p5.eval();
		System.out.println(pp5+"="+pi5);
		
		Expr p6 = new ModExpr(p,nn6);
		String pp6 = p6.prettyPrint();
		double pi6 = p6.eval();
		System.out.println(pp6+"="+pi6);
		
		Greater p7 = new Greater(p,nn6);
		String pp7 = p7.prettyPrint();
		boolean pi7 = p7.eval();
		System.out.println(pp7+"?"+pi7);

		Less p8 = new Less(p,nn6);
		String pp8 = p8.prettyPrint();
		boolean pi8 = p8.eval();
		System.out.println(pp8+"?"+pi8);

		Equal p9 = new Equal(p,nn6);
		String pp9 = p9.prettyPrint();
		boolean pi9 = p9.eval();
		System.out.println(pp9+"?"+pi9);
	
		NotEqual p1 = new NotEqual(p,nn6);
		String pp1 = p1.prettyPrint();
		boolean pi1 = p1.eval();
		System.out.println(pp1+"?"+pi1);

		GreaterEqual p0 =new GreaterEqual(p,nn6);
		String pp0 = p0.prettyPrint();
		boolean pi0 = p0.eval();
		System.out.println(pp0+"?"+pi0);
	
		LessEqual p00 =new LessEqual(p,nn6);
		String pp00 = p00.prettyPrint();
		boolean pi00 = p00.eval();
		System.out.println(pp00+"?"+pi00);
		
		// Tests for Stmt class
		Variable variable = new Variable("a");
		Assign assigment = new Assign(variable, p4);
		String out = assigment.prettyPrint();
		System.out.println(out);
		//System.out.println("Checking the value of variable: "+variable.prettyPrint()+", "+assigment.expr.eval());		
		
		// Not test		
		Not no = new Not(p9);
		boolean ja = no.eval();
		String jo = no.prettyPrint();		
		System.out.println(jo+"?"+ja);
		System.out.println();
		
		// if test
		Variable  v = new Variable("V");
		Stmt      r = new Read(v);
		Stmt      rr = new Read(variable);
		If si = new If(p9,r,rr);
		String so = si.prettyPrint();
		System.out.println(so);
		System.out.println();
		
		// while test -incomplete
		Literal a = new Literal(4);
		Literal b = new Literal(2);
		Greater c = new Greater(a,b);		
		Stmt d = new Read(variable);		
		While wh = new While(c,d);
		System.out.println(wh.prettyPrint());

	}

}
