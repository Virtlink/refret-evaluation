test;
[p2] {
[B]
    package p2;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
  	/**
  	 * This is a comment
  	 * @param j a float
  	 * @param foo a foo
  	 * @param bar a bar
  	 */
  	public void mA1(float j, int foo, String bar) {
  		mB1();
  		System.out.println(bar + j);
  	}
  }
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public class A {
  	public B fB;
  
  	/**
  	 * This is a comment
  	 * @param j a float
  	 * @param foo a foo
  	 * @param bar a bar
  	 */
  	public void mA1(float j, int foo, String bar) {
  		fB.mA1(j, foo, bar);
  	}
  
  	public void mA2() {}
  }
}
