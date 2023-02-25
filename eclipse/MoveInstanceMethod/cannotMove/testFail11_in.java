test;
[p2] {
[B]
    package p2;
  
  public class B {
  	public void mB1() {}
  
  	public void mB2() {}
  }
}
[p1] {
[A]
    // Move mA1 to parameter b, do not inline delegator
  package p1;
  
  import p2.B;
  
  public class A {
  	public void mA1(B b, int a) {
  		mA2();
  	}
  
  	public void mA2() {}
  }
}
