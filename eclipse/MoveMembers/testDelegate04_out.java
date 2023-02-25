test;
[r] {
[B]
    package r;
  
  public class B {
  
  	public static void foo() {
  	}
  
  }
  
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#foo()} instead
  	 */
  	public static void foo() {
  		B.foo();
  	}
  
  }
  
}
