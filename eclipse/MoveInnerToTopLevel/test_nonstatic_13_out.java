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
  		this.a.i= 1;
  	}
  }
[A]
    package p;
  
  class A{
  	int i;
  }
}
