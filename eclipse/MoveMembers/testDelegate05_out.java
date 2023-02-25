test;
[p] {
[B]
    package p;
  
  public class B {
  
  	public static final String FOO= "foo";
  
  }
  
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#FOO} instead
  	 */
  	public static final String FOO= B.FOO;
  
  }
  
}
