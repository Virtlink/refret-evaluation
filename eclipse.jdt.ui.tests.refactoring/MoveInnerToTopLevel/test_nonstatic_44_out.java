test;
[p2] {
[MoreInner]
    package p2;
  class MoreInner {
  
  	/** Comment */
  	private final A.Inner p;
  
  	/**
  	 * @param inner
  	 */
  	MoreInner(A.Inner inner) {
  		p= inner;
  	}
  
  }
[A]
    package p2;
  
  public class A {
  
  	class Inner {
  	}
  
  }
  
}
