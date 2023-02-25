test;
[p2] {
[B]
    package p2;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
  	/**
  	 * This is a comment
  	 * @param j
  	 * @param foo
  	 * @param bar
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
  
  	/**
  	 * This is a comment
  	 * @param j
  	 * @param b
  	 * @param foo
  	 * @param bar
  	 */
  	public void mA1(float j, B b, int foo, String bar) {
  		b.mA1(j, foo, bar);
  	}
  
  	public void mA2() {}
  }
}
