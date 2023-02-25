test;
[p] {
[B]
    package p;
  
  public class B extends A {
  
  	protected static void foo() {}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	private static void bar() { B.foo(); }
  
  
  }
  
}
