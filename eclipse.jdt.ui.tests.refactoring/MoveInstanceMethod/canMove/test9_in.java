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
    package p1;
  
  import p2.B;
  
  public class A {
  	public void mA1(float j, B b, int foo, String bar) {
  		b.mB1();
  		mA2();
  		b.mB2();
  		System.out.println(this);
  		System.out.println(bar + j);
  	}
  
  	public void mA2() {}
  }
}
