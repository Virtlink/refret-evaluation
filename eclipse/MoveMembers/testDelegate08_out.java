test;
[r] {
[B]
    package r;
  
  public class B {
  
  	public static final String FOO= "Foo";
  
  }
  
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#FOO} instead
  	 */
  	public static final String FOO= B.FOO;
  
  }
  
}
