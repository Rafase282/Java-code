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
public class Interpreter {

	/**
	 * @param args input for the program being interpreted.
	 */
	public static void main(String[] args) {
		Read.setArgs(args);
		
		/*
		System.out.println("program is: hello");
		Stmt program0 = makeHelloProgram();
		System.out.println("program text:\n"+program0.prettyPrint());
		System.out.println("program output:");
		program0.interprete();
		System.out.println();
		
		
		
		System.out.println("program is: seven");
		Stmt program1 = makeSevenProgram();
		System.out.println("program text:\n"+program1.prettyPrint());
		System.out.println("program output:");
		program1.interprete();
		System.out.println();
		
		
		
		System.out.println("program is: assign");
		Stmt program3 = makeAssignProgram();
		Stmt program2 = makeMaxProgram();
		System.out.println("program text:\n"+program2.prettyPrint());
		System.out.println("program output:");
		program2.interprete();
		System.out.println();
		
		
		
		System.out.println("program is: max");
		//Stmt program2 = makeMaxProgram();
		System.out.println("program text:\n"+program3.prettyPrint());
		System.out.println("program output:");
		program3.interprete();
		System.out.println();
		*/
		
		
		System.out.println("program is: factor");
		Stmt program4 = makeFactorProgram();
		System.out.println("program text:\n"+program4.prettyPrint());
		System.out.println("program output:");
		program4.interprete();
		System.out.println();
		
	}
/*
	private static Stmt makeHelloProgram() {
		return new Write("Hello, Cruel World!\n");
	}

	private static Stmt makeSevenProgram() {
		Variable  v = new Variable("V");
		Literal  l2 = new Literal(2);
		Literal l14 = new Literal(14);
		Expr      a = new TimesExpr(l2, v);
		Expr      b = new PlusExpr(a, l14);
		Expr      c = new DivExpr(b, l2);
		Expr      d = new MinusExpr(c, v);
		Stmt      r = new Read(v);
		Stmt      w = new Write(d);
		Stmt      s = new Block(r, w);
		return s;
	}

	private static Stmt makeAssignProgram() {
		Variable  x = new Variable("X");
		Variable  y = new Variable("Y");
		Literal  l1 = new Literal(1);
		Literal  l7 = new Literal(7);
		Stmt     ax = new Assign(x, l7);
		Expr     m0 = new MinusExpr(x, l1);
		Stmt     ay = new Assign(y, m0);
		Stmt     b0 = new Block(ax, ay);
		Stmt     w0 = new Write("Y = ");
		Stmt     w1 = new Write(y);
		Stmt     b1 = new Block(w0, w1);
		Stmt     b2 = new Block(b0, b1);
		return b2;
	}

	private static Stmt makeMaxProgram() {
		Variable  x = new Variable("X");
		Variable  y = new Variable("Y");
		Test     t0 = new Equal(x, y);
		Test     t1 = new Less(x, y);
		Stmt     rx = new Read(x);
		Stmt     ry = new Read(y);
		Stmt     b0 = new Block(rx, ry);
		Stmt     w0 = new Write("X and Y are equal");
		Stmt     w1 = new Write("X is the max.");
		Stmt     w2 = new Write("Y is the max.");
		Stmt     i1 = new If(t1, w2, w1);
		Stmt     i0 = new If(t0, w0, i1);
		Stmt     b1 = new Block(b0, i0);
		return b1;
	}

	/**
	 * Construct a program that factors an input parameter
	 * 
	 * It should prettyPrint as follows (more or less):
	 * 
	 *   ?N
	 *   !N
	 *   if (N<1) then
	 *      !" is an illegal argument"
	 *   else if (N==1) then
	 *      !" is the unit"
	 *   else
	 *      F=0
	 *      I=2
	 *      while ((I*I)<=N)
	 *         if (0==(N%I)) then
	 *            N=(N/I)
	 *            F=(F+1)
	 *            if (1==F) then
	 *               !" has factors:\n  "
	 *            else
	 *               !", "
	 *            !I
	 *         else
	 *            I=(I+1)
	 *      if (0==F) then
	 *         !" is prime"
	 *   !".\n"
	 *   
	 *   Note: I could have easily made a mistake coding this.  
	 *   Draw the tree (start at b0 and work backward) to check.
	 *   Let me know, if there is an error.
	 *   
	 * @return the constructed factor program
	 */

	private static Stmt makeFactorProgram() {
		Variable vN = new Variable("N");
		Variable vI = new Variable("I");
		Variable vF = new Variable("F");
		Expr l0     = new Literal(0);
		Expr l1     = new Literal(1);
		Expr l2     = new Literal(2);
		Expr e0     = new TimesExpr(l1, vI);
		Expr e1     = new ModExpr(vN, vI);
		Expr e2     = new DivExpr(vN, vI);
		Expr e3     = new PlusExpr(vF, l1);
		Expr e4     = new PlusExpr(vI, l1);
		Test t0     = new Less(vN, l1);
		Test t1     = new Equal(vN, l1);
		Test t2     = new LessEqual(e0, vN);
		Test t3     = new Equal(l0, e1);
		Test t4     = new Equal(l1, vF);
		Test t5     = new Equal(l0, vF);
		Stmt rN     = new Read(vN);
		Stmt w0     = new Write(vN);
		Stmt w1     = new Write(" is an illegal argument");
		Stmt w2     = new Write(" is the unit");
		Stmt w3     = new Write(" has factors: \n");
		Stmt w4     = new Write(", ");
		Stmt w5     = new Write(vI);
		Stmt w6     = new Write(" is prime");
		Stmt w7     = new Write(".\n");
		Stmt a0     = new Assign(vF, l0);
		Stmt a1     = new Assign(vI, l2);
		Stmt a2     = new Assign(vN, e2);
		Stmt a3     = new Assign(vF, e3);
		Stmt a4     = new Assign(vI, e4);
		Stmt i3     = new If(t4, w3, w4);
		Stmt i4     = new If(t5, w6);
		Stmt b20    = new Block(a2, a3);
		Stmt b21    = new Block(b20, i3);
		Stmt b2     = new Block(b21, w5);
		Stmt i2     = new If(t3, b2, a4);
		Stmt w8     = new While(t2, i2);
		Stmt b10    = new Block(a0, a1);
		Stmt b11    = new Block(b10, w8);
		Stmt b1     = new Block(b11, i4);
		Stmt i1     = new If(t1, w2, b1);
		Stmt i0     = new If(t0, w1, i1);
		Stmt b00    = new Block(rN, w0);
		Stmt b01    = new Block(b00, i0);
		Stmt b0     = new Block(b01, w7);
		return b0;
	}

}
