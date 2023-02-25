test;
[r] {
[B]
    package r;
  
  import p1.A;
  
  public class B {
  	public void m() {
  	}
  
  	public void moveMe() {
  		m();
  		A.staticMethod();
  	}
  }
  
}
[p] {
[A]
    package p;
  
  import p2.B;
  
  public class A {
  	public B b = new B();
  
  	public static void staticMethod() {
  	}
  }
  
}
