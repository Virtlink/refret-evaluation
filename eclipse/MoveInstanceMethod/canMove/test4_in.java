test;
[p2] {
[B]
    package p2;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  }
}
[p3] {
[C]
    package p3;
  
  import p1.A;
  
  class C {
  	C() {
  		A a= new A();
  		a.mA1();
  	}
  }
}
[p1] {
[A]
    // Move mA1 to field fB, inline delegator, remove delegator
  package p1;
  
  import p2.B;
  
  public class A {
  	public B fB;
  
  	public void mA1() {
  		fB.mB1();
  		mA2();
  		fB.mB2();
  		System.out.println(this);
  	}
  
  	public void mA2() {}
  }
}
