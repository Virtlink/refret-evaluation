test;
[r] {
[B]
    package r;
  
  import p.A;
  
  public class B{
  
  	private static void bar() { A.foo(); }
  }
}
[p] {
[A]
    package p;
  
  public class A {
  
  	public static void foo() {}
  
  }
  
}
