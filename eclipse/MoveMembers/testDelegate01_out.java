test;
[p] {
[B]
    package p;
  
  public class B {
  
  	public static void foo() {
  	}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#foo()} instead
  	 */
  	public static void foo() {
  		B.foo();
  	}
  
  }
  
}
