test;
[r] {
[B]
    package r;
  public class B{
  }
}
[p] {
[A]
    package p;
  
  public class A {
  
  	private static void foo() {}
  	private static void bar() { foo(); }
  
  }
  
}
