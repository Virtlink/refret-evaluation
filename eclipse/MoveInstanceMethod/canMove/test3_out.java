test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  
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
  
  class C {
  	{
  		A a= new A();
  		a.mA1();
  	}	
  }
}
[p1] {
[A]
    // Move mA1 to field fB, do not inline delegator
  package p1;
  
  import p2.B;
  
  public class A {
  	public B fB;
  
  	public void mA1() {
  		fB.mA1(this);
  	}
  
  	public void mA2() {}
  }
}
