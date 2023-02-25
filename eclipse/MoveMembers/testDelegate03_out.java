test;
[p] {
[B]
    package p;
  
  import java.util.ArrayList;
  
  public class B {
  
  	public static void foo() {
  		ArrayList a;
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
