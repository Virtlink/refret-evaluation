test;
[p] {
[Inner]
    package p;
  class Inner{
  
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
  }
  class B extends A{
  	void f(){
  		new Inner(this);
  	}
  }
}
