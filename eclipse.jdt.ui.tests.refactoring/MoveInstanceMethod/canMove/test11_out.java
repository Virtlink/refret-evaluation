test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
  	/**
  	 * This is a comment
  	 * @param a TODO
  	 * @param j
  	 * @param foo
  	 * @param bar
  	 */
  	public void mA1(A a, float j, int foo, String bar) {
  		mB1();
  		System.out.println(bar + j + a);
  		String z= a.fString + a.fBool;
  		a.fInt++;
  	}
  }
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public class A {
  	public int fInt;
  	public B fB;
  	public String fString;
  	public boolean fBool;
  
  	/**
  	 * This is a comment
  	 * @param j
  	 * @param foo
  	 * @param bar
  	 */
  	public void mA1(float j, int foo, String bar) {
  		fB.mA1(this, j, foo, bar);
  	}
  
  	public void mA2() {}
  }
}
