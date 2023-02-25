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
  		A.i= 1;
  	}
  }
[A]
    package p;
  
  class A{
  	static int i;
  }
}
