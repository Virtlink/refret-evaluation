test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
  	/**
  	 * @param a TODO
  	 */
  	public void mA1(A a) {
  		mB1();
  		a.mA2();
  		mB2();
  		System.out.println(a);
  	}
  }
}
[p3] {
[C]
    package p3;
  
  import p1.A;
  import p2.B;
  
  class C {
      C() {
  		getB().mA1(getA());
  	}
  
  	A getA() {
  		return null;
  	}
  
  	B getB() {
  		return null;
  	}
  }
}
[p1] {
[A]
    // Move mA1 to parameter b, inline delegator
  package p1;
  
  import p2.B;
  
  public class A {
  
  	/**
  	 * @param b
  	 */
  	public void mA1(B b) {
  		b.mA1(this);
  	}
  
  	public void mA2() {}
  }
}
