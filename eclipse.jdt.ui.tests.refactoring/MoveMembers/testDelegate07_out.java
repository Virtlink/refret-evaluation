test;
[p] {
[B]
    package p;
  
  import java.util.ArrayList;
  
  public class B {
  
  	public static final A FOO= new A() {
  		ArrayList a;
  	};
  
  }
  
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#FOO} instead
  	 */
  	public static final A FOO= B.FOO;
  
  }
  
}
