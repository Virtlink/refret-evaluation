test;
[p5] {
[MoreInner]
    package p5;
  class MoreInner {
  
  	/** Comment */
  	private final A.Inner inner;
  
  	/**
  	 * @param inner
  	 */
  	MoreInner(A.Inner inner) {
  		this.inner= inner;
  	}
  
  	{
  		this.inner.someField++;
  	}
  
  }
[A]
    package p5;
  
  public class A {
  
  	class Inner {
		
  		int someField = 0;
  	}
  
  }
  
}
