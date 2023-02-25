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
  
  	void f(){
  		this.a.foo();
  	}
  }
[A]
    package p;
  
  class A{
  	void foo(){
  	}
  }
}
