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
  
  	void f(){
  		this.a.m= 1;
  	}
  }
[A]
    package p;
  class A {
  	int m;
  }
}
