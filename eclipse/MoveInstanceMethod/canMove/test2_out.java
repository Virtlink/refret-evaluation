test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
  	/**
  	 * mA1
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
  		A a= new A();
  		new B().mA1(a);
  	}	
  }
}
[p1] {
[A]
    // Move mA1 to parameter b, inline delegator, remove delegator
  package p1;
  
  public class A {
  
  	public void mA2() {}
  }
}
