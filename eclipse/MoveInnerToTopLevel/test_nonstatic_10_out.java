test;
[p] {
[Inner]
    package p;
  class Inner {
  
  	/** Comment */
  	private A a;
  
  	/**
  	 * @param a
  	 */
  	Inner(A a) {
  		this.a= a;
  	}
  }
[A]
    package p;
  
  class A{
  	A a;
  	void f(A a){
  		new Inner(a.a.a);
  	}
  }
}
