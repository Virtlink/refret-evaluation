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
  import p2.B;
  
  class C {
  	{
  		A a= new A();
  		a.mA1(new B());
  	}	
  }
}
[p1] {
[A]
    // Move mA1 to parameter b, do not inline delegator
  package p1;
  
  import p2.B;
  
  public class A {
  
  	/**
  	 * @param b
  	 */
  	public void mA1(B b) {
  		b.mB1();
  		mA2(); //test comment
  		b.mB2();
  		System.out.println(this);
  	}
  
  	public void mA2() {}
  }
}
