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
  		A.foo();
  	}
  }
[A]
    package p;
  
  class A{
  	static void foo(){
  	}
  }
}
