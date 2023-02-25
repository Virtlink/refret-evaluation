test;
[p] {
[B]
    package p;
  
  public class B {
  
  	public void foo() {
  		B.m();
  	}
  
  	public static void m() {
  	}
  }
[A]
    package p;
  
  public class A {
  
  }
}
