test;
[p] {
[B]
    package p;
  
  public class B {
  
  	static void foo() {
  	}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#foo()} instead
  	 */
  	private static void foo() {
  		B.foo();
  	}
  
  }
  
}
