test;
[p] {
[Inner]
    package p;
  class Inner{
  
  	/** Comment */
  	private final A a;
  
  	/**
  	 * @param a
  	 */
  	Inner(A a) {
  		this.a= a;
  	}
  }
[A]
    package p;
  public class A {
  }
}
