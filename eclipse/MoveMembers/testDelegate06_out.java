test;
[p] {
[B]
    package p;
  
  public class B {
  
  	static final String FOO= "foo";
  
  }
  
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link B#FOO} instead
  	 */
  	private static final String FOO= B.FOO;
  
  }
  
}
