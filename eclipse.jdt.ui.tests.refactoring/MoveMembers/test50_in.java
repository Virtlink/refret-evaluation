test;
[p] {
[B]
    package p;
  
  public class B extends A {
  
  }
  
[A]
    package p;
  
  public class A {
  
  	private static void foo() {}
  	private static void bar() { foo(); }
  
  
  }
  
}
