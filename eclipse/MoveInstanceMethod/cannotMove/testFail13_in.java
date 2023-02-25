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
    // Move foobar
  package p1;
  import p2.B;
  public @interface A {
  	String foo(B b);
  }
}
